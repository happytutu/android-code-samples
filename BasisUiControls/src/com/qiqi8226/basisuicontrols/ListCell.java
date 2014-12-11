/**
 * Copyright 2014 qiqi8226
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qiqi8226.basisuicontrols;

import android.content.Context;
import android.content.Intent;

public class ListCell {
    
    public ListCell(Context context, Intent intent, String name) {
        this.context = context;
        this.intent = intent;
        this.name = name;
    }
    
    private String name = "";
    
    public String getName() {
        return name;
    }

    private Context context;
    
    public Context getContext() {
        return context;
    }
    
    private Intent intent;
    
    public Intent getIntent() {
        return intent;
    }
    
    public void startActivity() {
        getContext().startActivity(getIntent());
    }
    
    @Override
    public String toString() {
        return getName();
    }
}
