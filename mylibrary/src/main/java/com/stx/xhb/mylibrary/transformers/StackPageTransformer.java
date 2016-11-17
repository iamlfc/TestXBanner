package com.stx.xhb.mylibrary.transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * Created by jxnk25 on 2016/10/18.
 *
 * @link https://xiaohaibin.github.io/
 * @email： xhb_199409@163.com
 * @github: https://github.com/xiaohaibin
 * @description：
 */
public class StackPageTransformer extends BasePageTransformer {

    @Override
    public void handleInvisiblePage(View view, float position) {
    }

    @Override
    public void handleLeftPage(View view, float position) {
    }

    @Override
    public void handleRightPage(View view, float position) {
        ViewHelper.setTranslationX(view, -view.getWidth() * position);
    }

}