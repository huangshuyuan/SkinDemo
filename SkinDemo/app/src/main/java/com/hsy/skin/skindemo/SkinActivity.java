package com.hsy.skin.skindemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.io.File;

import solid.ren.skinlibrary.SkinLoaderListener;
import solid.ren.skinlibrary.loader.SkinManager;

public class SkinActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //添加改变的组件
        dynamicAddView(fab, "backgroundTint", R.color.colorAccent);
        findViewById(R.id.ll_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkinManager.getInstance().restoreDefaultTheme();

            }
        });
        findViewById(R.id.ll_brown).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SkinManager.getInstance().loadSkin("skin_blue.skin", new SkinLoaderListener() {
                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onSuccess() {
                        Toast.makeText(SkinActivity.this, "切换成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailed(String errMsg) {
                        Toast.makeText(SkinActivity.this, "切换失败"+errMsg, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onProgress(int progress) {

                    }
                });

            }
        });
        findViewById(R.id.ll_black).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SkinManager.getInstance().loadSkin("skin_red.skin", new SkinLoaderListener() {
                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onSuccess() {
                        Toast.makeText(SkinActivity.this, "切换成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailed(String errMsg) {
                        Toast.makeText(SkinActivity.this, "切换失败"+errMsg, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onProgress(int progress) {

                    }
                });

            }
        });
    }

}
