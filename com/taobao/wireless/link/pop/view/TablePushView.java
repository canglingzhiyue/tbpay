package com.taobao.wireless.link.pop.view;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.wireless.link.common.b;
import com.taobao.wireless.link.pop.PopMessageData;
import com.taobao.wireless.link.pop.d;
import tb.kge;
import tb.rkg;
import tb.rki;
import tb.rkj;

/* loaded from: classes9.dex */
public class TablePushView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TUrlImageView mIvLeftLogo;
    private static TUrlImageView mIv_delete;
    private static TextView mTv_button;
    private static TextView mTv_sub_title;
    private static TextView mTv_title;
    private static View mView;
    public static int viewHeight;
    public static int viewWidth;

    static {
        kge.a(2145708216);
    }

    public static /* synthetic */ void access$000(String str, PopMessageData popMessageData, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7dbbd", new Object[]{str, popMessageData, context});
        } else {
            jumpInPage(str, popMessageData, context);
        }
    }

    public TablePushView(Context context, PopMessageData popMessageData) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.table_push_window, this);
        mView = findViewById(R.id.table_push_layout);
        mView.setLayoutParams(new LinearLayout.LayoutParams(((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth() - d.a(20.0f), d.a(75.0f)));
        viewHeight = mView.getLayoutParams().height;
        viewWidth = mView.getLayoutParams().width;
        mIvLeftLogo = (TUrlImageView) findViewById(R.id.iv_left_logo);
        mTv_title = (TextView) mView.findViewById(R.id.tv_title);
        mTv_sub_title = (TextView) mView.findViewById(R.id.tv_sub_title);
        mTv_button = (TextView) mView.findViewById(R.id.tv_button);
        mIv_delete = (TUrlImageView) findViewById(R.id.iv_delete);
        updateView(context, popMessageData);
    }

    private static void updateView(final Context context, final PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0310859", new Object[]{context, popMessageData});
            return;
        }
        if (!StringUtils.isEmpty(popMessageData.backgroundColor)) {
            mView.setBackgroundColor(Color.parseColor(popMessageData.backgroundColor));
        }
        if (!StringUtils.isEmpty(popMessageData.leftLogoUrl)) {
            mIvLeftLogo.setStrategyConfig(ImageStrategyConfig.a("1111", "1111").a());
            mIvLeftLogo.setImageUrl(popMessageData.leftLogoUrl);
        } else if (Boolean.parseBoolean(b.a(context, "popMessageTablePushImageCanGone", "true"))) {
            mIvLeftLogo.setVisibility(8);
        }
        if (!StringUtils.isEmpty(popMessageData.title)) {
            mTv_title.setText(popMessageData.title);
        }
        if (!StringUtils.isEmpty(popMessageData.subTitle)) {
            mTv_sub_title.setText(popMessageData.subTitle);
        }
        if (!StringUtils.isEmpty(popMessageData.rightButtonText)) {
            mTv_button.setText(popMessageData.rightButtonText);
        }
        View view = mView;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.wireless.link.pop.view.TablePushView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        TablePushView.access$000("full", PopMessageData.this, context);
                    }
                }
            });
        }
        TextView textView = mTv_button;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.wireless.link.pop.view.TablePushView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        TablePushView.access$000(com.taobao.taolive.sdk.mergeInfo.b.TYPE_PART, PopMessageData.this, context);
                    }
                }
            });
        }
        TUrlImageView tUrlImageView = mIv_delete;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.wireless.link.pop.view.TablePushView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                com.taobao.wireless.link.pop.a.b(context, popMessageData);
                rki.a(rki.ARG1_POP_DELETE, "desktop_push", popMessageData.messageId, null);
                TaobaoRegister.dismissMessage(context, popMessageData.messageId, "");
            }
        });
    }

    private static void jumpInPage(String str, PopMessageData popMessageData, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf91c0ef", new Object[]{str, popMessageData, context});
            return;
        }
        rkg.a("link_tag", "PopManager === TablePushView == 点击查看:" + popMessageData.rightButtonUrl);
        rkj.a(context, d.f23618a + "growth_dhh_2200803434487_android-overlaytop-1069565676&h5Url=" + popMessageData.rightButtonUrl, popMessageData.rightButtonUrl, "desktop_push_activity", popMessageData.messageId);
        com.taobao.wireless.link.pop.a.b(context, popMessageData);
        rki.a(rki.TABLE_PUSH_CLICK, popMessageData.messageId, str, null);
        TaobaoRegister.clickMessage(context, popMessageData.messageId, "");
    }

    public static void updateTablePush(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb94dd4a", new Object[]{context, popMessageData});
            return;
        }
        try {
            updateView(context, popMessageData);
        } catch (Exception e) {
            rkg.b("link_tag", "TablePushView === updateTablePush === 更新tablepush异常：" + e);
        }
    }
}
