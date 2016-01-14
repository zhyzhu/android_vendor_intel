/* Android Modem NVM Configuration Tool
*
* Copyright (C) Intel 2012
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
* Author: Edward Marmounier <edwardx.marmounier@intel.com>
*/

package com.intel.android.nvmconfig.models.modem;

import java.util.ArrayList;
import java.util.List;

public class ModemControlResponseList<R> {

    protected ArrayList<R> responses = new ArrayList<R>();

    public ModemControlResponseList() {

    }

    public ModemControlResponseList(List<R> responses) {

        this.responses.addAll(responses);
    }

    public List<R> getResponses() {
        return this.responses;
    }
}