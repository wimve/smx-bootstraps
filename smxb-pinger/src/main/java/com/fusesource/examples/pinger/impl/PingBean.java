/*
 * Copyright 2012 FuseSource
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
package com.fusesource.examples.pinger.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.fusesource.examples.pinger.Ping;

/**
 * A bean which we use in the route
 */
public class PingBean implements Ping {

    private String say = "Ping";

    public String ping() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return say + " at " + sdf.format(new Date());
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}
