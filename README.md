
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
