package com.xiaoguang.xtaobao.presenter;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import com.jude.rollviewpager.RollPagerView;
import com.sunfusheng.marqueeview.MarqueeView;
import com.xiaoguang.xtaobao.R;
import com.xiaoguang.xtaobao.adapter.AdRollPagerViewAdapter;
import com.xiaoguang.xtaobao.adapter.ContentGridViewAdapter;
import com.xiaoguang.xtaobao.adapter.SortGridViewAdapter;
import com.xiaoguang.xtaobao.application.CustomApplcation;
import com.xiaoguang.xtaobao.bean.Goods;
import com.xiaoguang.xtaobao.bean.GoodsType;
import com.xiaoguang.xtaobao.contract.IFragHomeContract;
import com.xiaoguang.xtaobao.util.LogUtils;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * 主页的Fragment的处理类
 * Created by 11655 on 2016/10/19.
 */

public class FragHomePresenterImpl implements IFragHomeContract.IFragHomePresenter {
    //存放轮播图片Id
    private ArrayList<Integer> imgs;
    //存放中间小控件的id
    private Integer[] sortImgs;
    //存放中间的文字
    private String[] sortStrs;
    //存放下部分小图标
    private Integer contentIcoImgs[];
    //存放商品图片
    private Integer contentImgs[];
    //存放小图标对应文字
    private String contentText[];
    //存放下面文字
    private String contentText2[];
    private AdRollPagerViewAdapter adapter;
    private final IFragHomeContract.IFragHomeView view;
    private GridView gridViewContent;
    private RollPagerView rollPagerViewAd;
    private GridView gridViewSort;
    private MarqueeView marqueeViewTop;
    private EditText editText;

    public FragHomePresenterImpl(IFragHomeContract.IFragHomeView view) {
        this.view = view;
        view.setPresenter(this);
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void initData() {
        //获取显示广告的RollPagerView对象
        rollPagerViewAd = view.getmActHomeVpAd();
        //获取中间显示各个小控件的GridView
        gridViewSort = view.getGridViewSort();
        //获取显示资讯头条的控件
        marqueeViewTop = view.getMarqueeViewTop();
        //获取下部分的GridView空间
        gridViewContent = view.getGridViewContent();
        //获取搜索框
        editText = view.getmFragHomeEtSearch();
        //初始化数据源
        imgs = new ArrayList<>();
        //添加数据
        imgs.add(R.drawable.pager1);
        imgs.add(R.drawable.pager2);
        imgs.add(R.drawable.pager3);
        imgs.add(R.drawable.pager4);
        imgs.add(R.drawable.pager5);

        sortImgs = new Integer[]{R.drawable.frag_home_sort_tianmao, R.drawable.frag_home_sort_juhuasuan,
                R.drawable.frag_home_sort_jinkou, R.drawable.frag_home_sort_waimai, R.drawable.frag_home_sort_market,
                R.drawable.frag_home_sort_chongzhi, R.drawable.frag_home_sort_travel, R.drawable.frag_home_sort_tao,
                R.drawable.frag_home_sort_daojia, R.drawable.frag_home_sort_type};
        sortStrs = new String[]{"天猫", "聚划算", "天猫国际", "外卖", "天猫超市", "充值中心", "阿里旅行",
                "领金币", "到家", "分类"};
        contentIcoImgs = new Integer[]{R.drawable.frag_home_qianggou, R.drawable.frag_home_haohuo,
                R.drawable.frag_home_guangjie, R.drawable.frag_home_qingdan};
        contentImgs = new Integer[]{R.drawable.xiangj, R.drawable.bookbag, R.drawable.xiangj, R.drawable.bookbag};
        contentText = new String[]{"淘抢购", "有好货", "爱逛街", "必买清单"};
        contentText2 = new String[]{"极速抢购", "高颜值美物", "时髦流行家", "整理好帮手"};

        //此处数据，应该为从网络上获取
        List<String> info = new ArrayList<>();
        info.add("1. 大家好，我是金洪光。");
        info.add("2. 我要找一份工作！");
        info.add("3. GitHub帐号：hongguangKim");
        info.add("4. 淘宝双11.11");
        info.add("5. 个人博客");
        info.add("6. 消息进行测试");
        //启动滚动
        marqueeViewTop.startWithList(info);
        //初始化适配器
        adapter = new AdRollPagerViewAdapter(imgs);
        //为RollPagerView 设置适配器
        rollPagerViewAd.setAdapter(adapter);
        //为gridVIew 设置适配器
        gridViewSort.setAdapter(new SortGridViewAdapter(CustomApplcation.getInstance().context, sortImgs, sortStrs, R.layout.frag_home_gv_sort_item));
        gridViewContent.setAdapter(new ContentGridViewAdapter(CustomApplcation.getInstance().context,
                contentIcoImgs, contentImgs, contentText, contentText2));
        //初始化监听
        initEvent();
    }

    /**
     * 初始化监听事件
     */
    private void initEvent() {
        //为中间小控件GridView设置监听事件
        gridViewSort.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        FragHomePresenterImpl.this.view.jumpActivity(0, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 1:
                        FragHomePresenterImpl.this.view.jumpActivity(1, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 2:
                        FragHomePresenterImpl.this.view.jumpActivity(2, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 3:
                        FragHomePresenterImpl.this.view.jumpActivity(3, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 4:
                        FragHomePresenterImpl.this.view.jumpActivity(4, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 5:
                        FragHomePresenterImpl.this.view.jumpActivity(5, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 6:
                        FragHomePresenterImpl.this.view.jumpActivity(6, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 7:
                        FragHomePresenterImpl.this.view.jumpActivity(7, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 8://跳转到webview,暂时不传递数据，仅进行数据测试
                        FragHomePresenterImpl.this.view.jumpActivity(8, "",IFragHomeContract.NONE_FUNC);
                        break;
                    case 9://分类
                        FragHomePresenterImpl.this.view.jumpActivity(9, "",IFragHomeContract.NONE_FUNC);
                        break;
                }
            }
        });

        //为搜索按钮设置事件
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                //点击回车处理事件
                queryDatasFromServer(editText.getText().toString());
                return false;
            }
        });
    }

    /**
     * 根据输入内容查询类型
     *
     * @param inputText 输入的内容
     */
    private void queryDatasFromServer(final String inputText) {
        view.showMsg("搜索中...");
        if(inputText.trim().isEmpty()){
            view.canelLoadingDialog();
            FragHomePresenterImpl.this.view.jumpActivity(9, "",IFragHomeContract.NONE_FUNC);
            return;
        }

        BmobQuery<GoodsType> query = new BmobQuery<>();
        query.addWhereEqualTo("typeName",inputText);
        query.findObjects(new FindListener<GoodsType>() {
            @Override
            public void done(List<GoodsType> list, BmobException e) {
                view.canelLoadingDialog();
                if (e == null) {
                    if(list.size() == 0||list == null){
                        BmobQuery<Goods> query = new BmobQuery<>();
                        query.addWhereEqualTo("goodsName",inputText);
                        query.findObjects(new FindListener<Goods>() {
                            @Override
                            public void done(List<Goods> list, BmobException e) {
                                view.canelLoadingDialog();
                                if (e==null){
                                    //设置适配器
                                    if (list!=null&&list.size()>0){
                                        FragHomePresenterImpl.this.view.jumpActivity(10, inputText,IFragHomeContract.GOODS_NAME_QUERY_FUNC);
                                        view.showMsg("数据加载成功");
                                    }else {
                                        view.showMsg("数据为空>>");
                                    }
                                }else {
                                    view.showMsg("数据加载失败"+e.getLocalizedMessage());
                                    LogUtils.i(TAG,"数据加载成功"+e.toString());
                                }
                            }
                        });
                    }else{
                        for(int i=0;i<list.size();i++)
                            if(list.get(i).getTypeName().equalsIgnoreCase(inputText)) {
                                view.jumpActivity(10, list.get(i).getObjectId(), IFragHomeContract.GOODS_TYPE_QUERY_FUNC);
                                view.showMsg("数据加载成功");
                            }
                    }
                } else {
                    view.showMsg("搜索失败....");
                }
            }
        });
    }
}
