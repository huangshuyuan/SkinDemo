package com.hsy.skin.skindemo;

import attr.FabButtonAttr;
import attr.NavigationViewAttr;
import solid.ren.skinlibrary.SkinConfig;
import solid.ren.skinlibrary.base.SkinBaseApplication;

/**
 * 作者：huangshuyuan on 2017/5/22 15:47
 * 邮箱：hshuyuan@foxmail.com
 */

public class Application extends SkinBaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        SkinConfig.setCanChangeStatusColor(true);
        SkinConfig.setCanChangeFont(true);
        SkinConfig.setDebug(true);
        /**
         * 换肤默认只支持 android 的常用控件，对于支持库的控件和自定义控件的换肤需要动态添加（
         * 例如：
         * dynamicAddSkinEnableView(toolbar, "background", R.color.colorPrimaryDark);），
         * 在布局文件中使用skin:enable="true"是无效的。
         */
        SkinConfig.addSupportAttr("tabLayoutIndicator", new TabLayoutIndicatorAttr());
        SkinConfig.addSupportAttr("backgroundTint",new FabButtonAttr());
        SkinConfig.addSupportAttr("navigationViewMenu",new NavigationViewAttr());
        SkinConfig.enableGlobalSkinApply();
    }
}
