package com.folwview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.flowview.FlowView;
import com.flowview.OnFlowViewItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FlowView fv_view;
    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fv_view = (FlowView) findViewById(R.id.fv_view);
        List<String> mlist = new ArrayList<>();
        list = new ArrayList<>();
        mlist.add("圆明园");
        mlist.add("是每个中");//
        mlist.add("国人心中");
        mlist.add("的痛几代的");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");
        mlist.add("小明");
        mlist.add("奔驰E级");//
        mlist.add("宝马");
        mlist.add("斯邦威");//
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");//
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        mlist.add("Iphone7");//
        mlist.add("IPHONE7");
        mlist.add("日产楼兰");
        mlist.add("化妆品");//
        mlist.add("激光美白");
        mlist.add("360杀毒");

        list.add("1");
        list.add("3");
        list.add("6");
        list.add("9");
        list.add("11");
        fv_view.setTitle(mlist);
        fv_view.setSpecialItem(R.color.color_FCA21E, list, R.drawable.icon, 5,R.drawable.bg_selector_app);
//        fv_view.startLayout();

        fv_view.setOnFlowViewItemClickListener(new OnFlowViewItemClickListener() {
            @Override
            public void onClickListener(int position, String title) {
                Toast.makeText(MainActivity.this, position + "--" + title, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
