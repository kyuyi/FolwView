# FolwView
## 简介：
   FlowView使用的是LinearLayout+RelativeLayout+TextView 组合而成的一种流布局控件。
## 效果：
<img src="https://github.com/kyuyi/FolwView/blob/master/pic/Screenshot_2016-10-08-16-37-23_com.folwview.png"/>
##如何使用：
  ###目前只提供Gradle的使用方式使用方式如下：
  ####Gradle部分：
  ####XML部分：
        <com.flowview.FlowView xmlns:app="http://schemas.android.com/apk/res-auto"
            android:id="@+id/fv_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_margin="10dp"
            android:paddingBottom="20dp"
            app:content_lr_paddding="10dp"
            app:item_bg="@drawable/bg_selector_test"
            app:item_height="50dp"
            app:item_margin="1dp"
            app:rows_margin="1dp"
            app:td_num="five"
            app:text_color="#99FF99"
            app:text_size="11sp" />
  ####Java代码部分：
 FlowView  fv_view = (FlowView) findViewById(R.id.fv_view);
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
fv_view.setTitle(mlist); //设置需要显示的标题
 fv_view.startLayout();//开始绘制控件控件内容
##属性说明:
属性名称                       说明                              默认值
app:item_bg                   item的背景                        R.drawable.bg_selector 
app:text_size                 item的文字大小                    14sp
app:text_color                item的字体颜色                    R.color.color_646464  
app:item_margin               每个item之间的间隔                 6dp
app:rows_margin               每行之间的间隔                     6dp
app:td_num                    每行显示的item个数                 3个   枚举类型 目前只提供：three/four/five
app:content_lr_paddding       item的左右内补丁                   5dp(不提供上下的内补丁，上下的内补丁由行高来控制)
app:item_height               每行的高度    

                   

