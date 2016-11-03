package com.bawei.myglide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    String url="http://a0.att.hudong.com/15/08/300218769736132194086202411_950.jpg";
    String url1="http://imgsrc.baidu.com/forum/w%3D580/sign=3af9f2e5367adab43dd01b4bbbd6b36b/58ee3d6d55fbb2fb81f619df4f4a20a44723dc1a.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageView imageview=(ImageView)findViewById(R.id.imageview);
        Glide.with(this)
                .load(url1)//路径
                .asGif()//加载动态图片
                .thumbnail(0.5f)//小图
                .crossFade(500)
                .into(imageview);
    }
}
