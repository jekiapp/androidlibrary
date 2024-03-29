/**
 * Copyright Google Inc. All Rights Reserved.
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
package com.muzakki.ahmad.lib.services;

import com.google.firebase.iid.FirebaseInstanceIdService;
import com.muzakki.ahmad.lib.auth.Auth;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {


    /**
     * The Application's current Instance ID token is no longer valid and thus a new one must be requested.
     */
    public void onTokenRefresh() {
        Auth auth = Auth.getInstance(this);
        auth.saveToken();
    }



}
