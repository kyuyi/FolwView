# FolwView
## 简介：
   FlowView使用的是LinearLayout+RelativeLayout+TextView 组合而成的一种流布局控件。
## 效果：
<img src="https://github.com/kyuyi/FolwView/blob/master/pic/Screenshot_2016-10-08-16-37-23_com.folwview.png"/>
##如何使用：
###目前只提供Gradle的使用方式使用方式如下：
###Gradle部分：
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
        FlowView fv_view = (FlowView) findViewById(R.id.fv_view);
        //设置普通的item的方式
        List<String> mlist = new ArrayList<>();
        mlist.add("圆明园");
        mlist.add("是每个中");
        mlist.add("国人心中");
        mlist.add("的痛几代的");
        mlist.add("LV包包");
        mlist.add("迪奥香水");
        mlist.add("香奈儿");
        mlist.add("法拉粒儿");
        mlist.add("奔驰迈巴赫");
        fv_view.setTitle(mlist);
        fv_view.startLayout();
        //有时候有些item 需要重点突出，如果需要重点突出某个Item时请使用以下方式设置
        list = new ArrayList<>();   //用于存放特定item的下标
        list.add("1");
        list.add("3");
        list.add("6");
        list.add("9");
        list.add("11");
        //参数说明：特定item的字体颜色、特定item的下标集合、特定item的标志、特定item的特殊标志与文字之间的间隔、特定item的背景
        fv_view.setSpecialItem(R.color.color_FCA21E, list, R.drawable.icon, 5, R.drawable.bg_selector_app);
        //TODO 注意：
        //如果需要设置特定item的话你将不能调用 fv_view.startLayout();这个方法，如果调用，界面将会出现重复的数据
        // itemitem的点击事件
        fv_view.setOnFlowViewItemClickListener(new OnFlowViewItemClickListener() {
            @Override
            public void onClickListener(int position, String title) {
                Toast.makeText(MainActivity.this, position + "--" + title, Toast.LENGTH_SHORT).show();
            }
        });
##属性说明：
      <com.flowview.FlowView xmlns:app="http://schemas.android.com/apk/res-auto"
            android:id="@+id/fv_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_margin="10dp"
            android:paddingBottom="20dp"
            app:content_lr_paddding="10dp"                    item内补丁的左右间隔
            app:item_bg="@drawable/bg_selector_test"          item的背景
            app:item_height="50dp"                            行高
            app:item_margin="1dp"                             item之间的间隔
            app:rows_margin="1dp"                             行间隔
            app:td_num="five"                                 每行显示多少个       
            app:text_color="#99FF99"                          item字体颜色
            app:text_size="11sp" />                           item的字体大小
            
##注意事项：
   1.在使用特定的item时，item的b特殊标志，请务必提供各个分辨率的适配,否则可能在一些高低分辨率的手机上适配将会出问题
   2.档item的条数过多时需要将该控件添加一个ScrollView父容器，添加ScrollView父容器后最后一行的item显示不完整你需要在该控件添加一行：anroid:layout_paddingButton="数值dp"
