/*
* Copyright (c) 2009-2011 Intel Corporation.  All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

#ifndef VIDEO_ENCODER_HOST_H_
#define VIDEO_ENCODER_HOST_H_

#include "VideoEncoderInterface.h"

IVideoEncoder *createVideoEncoder(const char *mimeType);
void releaseVideoEncoder(IVideoEncoder *p);

#endif /* VIDEO_ENCODER_HOST_H_ */
