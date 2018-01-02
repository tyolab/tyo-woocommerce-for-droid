/*
 * Copyright (c) 2017 TYONLINE TECHNOLOGY PTY. LTD. (TYO Lab)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package au.com.tyo.inventory.ui.page;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import java.util.Date;

import au.com.tyo.inventory.Controller;
import au.com.tyo.inventory.model.ProductStockIn;
import au.com.tyo.json.android.pages.PageForm;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 29/12/17.
 */

public class PageStockIn extends PageForm<Controller> {

    private ProductStockIn productStockIn;

    /**
     * @param controller
     * @param activity
     */
    public PageStockIn(Controller controller, Activity activity) {
        super(controller, activity);
    }

    @Override
    public void bindData() {
        super.bindData();
    }

    @Override
    public void onDataBound() {
        super.onDataBound();

        productStockIn = (ProductStockIn) getForm();
    }

    @Override
    protected void onFormCheckFailed() {

    }

    @Override
    protected void saveFormData(Object form) {

    }

    @Override
    public void onFormClick(Context context, String key, String text) {

    }

    @Override
    public String formatDateTime(String key, Date date) {
        return null;
    }

    @Override
    public void onFieldClick(View v) {

    }
}
