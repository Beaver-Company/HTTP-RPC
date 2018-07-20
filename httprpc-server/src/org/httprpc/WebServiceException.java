/*
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

package org.httprpc;

import java.io.IOException;
import java.util.Map;

/**
 * Thrown to indicate that a service operation returned an error.
 */
public class WebServiceException extends IOException {
    private static final long serialVersionUID = 0;

    private int code;
    private Map<String, ?> error;

    /**
     * Constructs a new web service exception.
     *
     * @param message
     * The error message returned by the service.
     *
     * @param code
     * The HTTP status code returned by the service.
     *
     * @param error
     * Additional error information returned by the service, or <tt>null</tt>
     * if no additional information was provided.
     */
    public WebServiceException(String message, int code, Map<String, ?> error) {
        super(message);

        this.code = code;
        this.error = error;
    }

    /**
     * Returns the HTTP status code returned by the service.
     *
     * @return
     * The HTTP status code returned by the service.
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns additional error information returned by the service.
     *
     * @return
     * Additional error information returned by the service, or <tt>null</tt>
     * if no additional information was provided.
     */
    public Map<String, ?> getError() {
        return error;
    }
}
