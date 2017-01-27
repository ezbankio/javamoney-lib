/*
 * Copyright (c) 2012, 2013, Werner Keil, Credit Suisse (Anatole Tresch).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 *
 * Contributors: Anatole Tresch - initial version.
 */
package org.javamoney.cdi;

import org.javamoney.cdi.api.FormatSpec;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.money.format.MonetaryAmountFormat;
import java.util.Collection;
import java.util.List;

/**
 * Test bean for injection of format related beans and providers.
 */
@RequestScoped
public class FormatInjectedBean {

    @Inject @FormatSpec(name="default")
    MonetaryAmountFormat defaultFormat;

    @Inject @FormatSpec(name="default", providers = "ISO")
    MonetaryAmountFormat isoProviderFormat;

    @Inject @FormatSpec(name="default", attributes = "separator=-")
    MonetaryAmountFormat defaultWithCustomSeparator;

    @Inject @FormatSpec(name="default", locale="DE")
    Collection<MonetaryAmountFormat> germanFormats;

    @Inject @FormatSpec(name="default")
    Collection<MonetaryAmountFormat> defaultFormats;

}
