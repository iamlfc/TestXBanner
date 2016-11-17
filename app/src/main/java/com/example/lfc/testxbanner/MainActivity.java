package com.example.lfc.testxbanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.stx.xhb.mylibrary.XBanner;
import com.stx.xhb.mylibrary.transformers.Transformer;

import java.util.ArrayList;
import java.util.List;

//// TODO: 2016/11/17   感觉  Transformer.Accordion 和 Transformer.Depth 效果不错
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn01;
    private Button btn02;
    private Button btn03;
    private Button btn04;
    private Button btn05;
    private Button btn06;
    private Button btn07;
    private Button btn08;

    private Button btn09;
    private Button btn10;
    private Button btn11;
    private Button btn12;

    private XBanner mXBanner;

    private List<String> mListurl = new ArrayList<>();
    boolean isallow = true;
    List<String> tips = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initData() {
        String[] urls = {
//                 十分屌丝的 图片地址
                "http://c.hiphotos.baidu.com/image/h%3D360/sign=33dcbfea5d82b2b7b89f3fc201accb0a/d009b3de9c82d1585e277e5f840a19d8bd3e42b2.jpg",
                "http://d.hiphotos.baidu.com/image/h%3D360/sign=bcd07bc1202dd42a400907ad33395b2f/e4dde71190ef76c6cc15d5839816fdfaae516756.jpg",
                "http://f.hiphotos.baidu.com/image/h%3D360/sign=b023dbb2d739b60052ce09b1d9513526/f2deb48f8c5494ee55f2d7482ff5e0fe98257e8b.jpg",
                "http://c.hiphotos.baidu.com/image/h%3D360/sign=cb0881a4f403738dc14a0a24831bb073/08f790529822720e7efa1cfe79cb0a46f21fabfa.jpg",

                "http://a.hiphotos.baidu.com/image/h%3D360/sign=4f6888e673c6a7efa626ae20cdfaafe9/f9dcd100baa1cd11daf25f19bc12c8fcc3ce2d46.jpg",
                "http://h.hiphotos.baidu.com/image/h%3D360/sign=1bd81bfb93dda144c5096ab482b6d009/dc54564e9258d109a4d1165ad558ccbf6c814d23.jpg"


//            "http://7xi4up.com1.z0.glb.clouddn.com/%E5%A3%81%E7%BA%B81.jpg",
//            "http://7xi4up.com1.z0.glb.clouddn.com/%E5%A3%81%E7%BA%B82.jpg",
//            "http://7xi4up.com1.z0.glb.clouddn.com/%E5%A3%81%E7%BA%B83.jpg",
//            "http://7xi4up.com1.z0.glb.clouddn.com/%E5%A3%81%E7%BA%B84.jpg",
//            "http://7xi4up.com1.z0.glb.clouddn.com/%E5%A3%81%E7%BA%B85.jpg",
//            "http://7xi4up.com1.z0.glb.clouddn.com/%E5%A3%81%E7%BA%B86.jpg"
        };
//        mListurl
        for (int i = 0; i < 6; i++) {
            mListurl.add(urls[i]);
        }

        //加载广告图片
        mXBanner.setmAdapter(new MyAdapter(mListurl));


        for (int i = 0; i < 6; i++) {
            tips.add("i=" + i);
        }

        // TODO: 2016/11/17   设置 标题
        mXBanner.setData(mListurl, tips);
//
//        mXBanner.setData(mListurl, null);


    }

    private void initView() {

        mXBanner = (XBanner) findViewById(R.id.xbanner);
        mXBanner.setPageChangeDuration(800);  //   切换速度
        mXBanner.setmAutoPalyTime(3000);      // 持续时间
        mXBanner.setmAutoPlayAble(true);    //   自动播放
        mXBanner.setAllowUserScrollable(true);    // 允许用户控制
        mXBanner.setOnItemClickListener(new XBanner.OnItemClickListener() {
            @Override
            public void onItemClick(XBanner banner, int position) {
                Toast.makeText(MainActivity.this, "点击的是" + position + "个", Toast.LENGTH_SHORT).show();
            }
        });


        btn01 = (Button) findViewById(R.id.btn_01);
        btn02 = (Button) findViewById(R.id.btn_02);
        btn03 = (Button) findViewById(R.id.btn_03);
        btn04 = (Button) findViewById(R.id.btn_04);
        btn05 = (Button) findViewById(R.id.btn_05);
        btn06 = (Button) findViewById(R.id.btn_06);
        btn07 = (Button) findViewById(R.id.btn_07);
        btn08 = (Button) findViewById(R.id.btn_08);

        btn09 = (Button) findViewById(R.id.btn_09);
        btn10 = (Button) findViewById(R.id.btn_10);
        btn11 = (Button) findViewById(R.id.btn_11);
        btn12 = (Button) findViewById(R.id.btn_12);

        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);
        btn04.setOnClickListener(this);
        btn05.setOnClickListener(this);
        btn06.setOnClickListener(this);
        btn07.setOnClickListener(this);
        btn08.setOnClickListener(this);
        btn09.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        mXBanner.startAutoPlay();

    }

    @Override
    protected void onStop() {
        super.onStop();

        mXBanner.stopAutoPlay();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_01:
//默认
                mXBanner.setPageTransformer(Transformer.Default);
                break;
            case R.id.btn_02:
//                渐 隐
                mXBanner.setPageTransformer(Transformer.Alpha);

                break;
            case R.id.btn_03:
//                 旋转

                mXBanner.setPageTransformer(Transformer.Rotate);


                break;
            case R.id.btn_04:

//                 立方体
                mXBanner.setPageTransformer(Transformer.Cube);


                break;
            case R.id.btn_05:
//                 翻转
                mXBanner.setPageTransformer(Transformer.Flip);


                break;
            case R.id.btn_06:

//                折叠
                mXBanner.setPageTransformer(Transformer.Accordion);


                break;
            case R.id.btn_07:
// 变焦是什么鬼
                mXBanner.setPageTransformer(Transformer.Zoom);

                break;
            case R.id.btn_08:


                mXBanner.setPageTransformer(Transformer.ZoomCenter);

                break;
            case R.id.btn_09:
// 逐渐消失
                mXBanner.setPageTransformer(Transformer.ZoomFade);

                break;
            case R.id.btn_10:

//                 堆叠
                mXBanner.setPageTransformer(Transformer.ZoomStack);

                break;
            case R.id.btn_11:
//   深度
                mXBanner.setPageTransformer(Transformer.Depth);

                break;
            case R.id.btn_12:


//
//                if (isallow){
//                    isallow=false;
//                    mXBanner.setAllowUserScrollable(isallow);
//                }else {
//                    isallow=true;
//                    mXBanner.setAllowUserScrollable(isallow);
//                }

                isallow = !isallow;

                mXBanner.setAllowUserScrollable(isallow);

                String s = "";
                if (isallow) {
                    s = "好吧看你可怜 让你滑动图片";
                } else {
                    s = "我已经控制这个图片的节奏了，它不听你的了";
                }
                btn12.setText(s);
                break;

        }

    }

    public class MyAdapter implements XBanner.XBannerAdapter {
        private List<String> list_url = new ArrayList<>();

        public MyAdapter(List<String> list_url) {
            this.list_url = list_url;
        }

        @Override
        public void loadBanner(XBanner banner, View view, int position) {

            Glide.with(MainActivity.this).load(list_url.get(position)).placeholder(R.drawable.default_image).error(R.drawable.default_image).into((ImageView) view);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.info,menu);

        return  true;
//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        mXBanner.stopAutoPlay();
//        mXBanner.removeAllViews();
        //加载广告图片
//        mXBanner.setmAdapter(new MyAdapter(mListurl));

        switch (item.getItemId()){

            case  R.id.menu01:

//                mXBanner.setData(mListurl, tips);
//                mXBanner.setData(mListurl, null);
                break;

            case  R.id.menu02:
//                     mXBanner.setData(mListurl, tips);
//                mXBanner.setData(mListurl, null);
                break;

            case  R.id.menu03:

                break;

            case  R.id.menu04:

                break;



        }
        mXBanner.startAutoPlay();
        return super.onOptionsItemSelected(item);
    }
}
