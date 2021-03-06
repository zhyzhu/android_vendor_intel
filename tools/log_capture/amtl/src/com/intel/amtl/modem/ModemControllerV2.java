/* Android AMTL
 *
 * Copyright (C) Intel 2014
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.intel.amtl.modem;

import com.intel.amtl.exceptions.ModemControlException;
import com.intel.amtl.models.config.ModemConf;

public class ModemControllerV2 extends ModemController{

    public ModemControllerV2() throws ModemControlException {
        super();
    }

    public boolean queryTraceState() throws ModemControlException {
        return !checkOct().equals("0");
    }

    @Override
    public String confTraceAndModemInfo(ModemConf mdmConf) throws ModemControlException {
        return sendAtCommand(mdmConf.getXsio());
    }

    @Override
    public String switchTrace(ModemConf mdmConf)
            throws ModemControlException {
        return sendAtCommand(mdmConf.getXsystrace());
    }

    @Override
    public String switchOffTrace() throws ModemControlException {
        return sendAtCommand("AT+XSYSTRACE=0\r\n");
    }

    @Override
    public String flush(ModemConf mdmConf) throws ModemControlException {
        return sendAtCommand(mdmConf.getFlCmd());
    }

    @Override
    public void confApplyFinalize() throws ModemControlException {
        restartModem();
    }

    public String checkOct() throws ModemControlException {
        return getCmdParser().parseOct(sendAtCommand("at+xsystrace=11\r\n"));
    }

    public String checkAtTraceState() throws ModemControlException {
        return "";
    }
}
