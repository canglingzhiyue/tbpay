package com.alipay.android.msp.ui.birdnest.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.NavBarClickAction;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.mobile.beehive.eventbus.IEventSubscriber;
import com.alipay.mobile.beehive.eventbus.ThreadMode;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBFrameLayout;
import com.flybird.FBRootFrameLayout;
import com.flybird.FBScrollView;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class NavBarPlugin extends AbsFBPlugin implements IEventSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SLOP = 150;
    private int mBizId;
    private Context mContext;
    private View mCurFlybirdView;
    private FBPluginCtx mFBPluginCtx;
    private FBScrollView.FBScrollViewListener mFBScrollViewListener;
    private View mNavBarView;
    private BroadcastReceiver mReceiver;

    /* loaded from: classes3.dex */
    public interface OnNavBarShownListener {
        void onNavBarShown();
    }

    public static /* synthetic */ Object ipc$super(NavBarPlugin navBarPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FBPluginCtx access$000(NavBarPlugin navBarPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBPluginCtx) ipChange.ipc$dispatch("37bf0aaf", new Object[]{navBarPlugin}) : navBarPlugin.mFBPluginCtx;
    }

    public static /* synthetic */ View access$100(NavBarPlugin navBarPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cfd76e29", new Object[]{navBarPlugin}) : navBarPlugin.mCurFlybirdView;
    }

    public static /* synthetic */ int access$1000(NavBarPlugin navBarPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("478d6188", new Object[]{navBarPlugin})).intValue() : navBarPlugin.mBizId;
    }

    public static /* synthetic */ View access$102(NavBarPlugin navBarPlugin, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6d2f938b", new Object[]{navBarPlugin, view});
        }
        navBarPlugin.mCurFlybirdView = view;
        return view;
    }

    public static /* synthetic */ View access$200(NavBarPlugin navBarPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b050c42a", new Object[]{navBarPlugin}) : navBarPlugin.mNavBarView;
    }

    public static /* synthetic */ View access$202(NavBarPlugin navBarPlugin, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("25bc53ea", new Object[]{navBarPlugin, view});
        }
        navBarPlugin.mNavBarView = view;
        return view;
    }

    public static /* synthetic */ void access$300(NavBarPlugin navBarPlugin, String str, NavBarClickAction navBarClickAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6121f3d3", new Object[]{navBarPlugin, str, navBarClickAction});
        } else {
            navBarPlugin.genLeftBtn(str, navBarClickAction);
        }
    }

    public static /* synthetic */ Context access$400(NavBarPlugin navBarPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bc061f62", new Object[]{navBarPlugin}) : navBarPlugin.mContext;
    }

    public static /* synthetic */ void access$500(NavBarPlugin navBarPlugin, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96eb7de3", new Object[]{navBarPlugin, bitmap});
        } else {
            navBarPlugin.setBackGroundImage(bitmap);
        }
    }

    public static /* synthetic */ void access$600(NavBarPlugin navBarPlugin, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0a6997", new Object[]{navBarPlugin, new Integer(i)});
        } else {
            navBarPlugin.setAlpha(i);
        }
    }

    public static /* synthetic */ void access$700(NavBarPlugin navBarPlugin, FBScrollView fBScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3062e3d", new Object[]{navBarPlugin, fBScrollView});
        } else {
            navBarPlugin.setScrollListener(fBScrollView);
        }
    }

    public static /* synthetic */ void access$800(NavBarPlugin navBarPlugin, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9cc7155", new Object[]{navBarPlugin, new Integer(i)});
        } else {
            navBarPlugin.onFBScrollChanged(i);
        }
    }

    public static /* synthetic */ BroadcastReceiver access$900(NavBarPlugin navBarPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("cfa5bbe6", new Object[]{navBarPlugin}) : navBarPlugin.mReceiver;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.mContext = context.getApplicationContext();
        registerNavBarReceiver(context);
        EventBusManager.getInstance().register(this, ThreadMode.CURRENT, MspGlobalDefine.EVENT_CONTAINER_FINISH);
        return new View(context);
    }

    public NavBarPlugin(FBPluginCtx fBPluginCtx, int i) {
        this.mBizId = i;
        this.mFBPluginCtx = fBPluginCtx;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        final MspContainerPresenter containerPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals("src")) {
            try {
                LogUtil.record(4, "NavBarPlugin updateAttr_src", str2);
                JSONObject parseObject = JSONObject.parseObject(str2);
                if (parseObject.containsKey("callbacks") && parseObject.containsKey("data")) {
                    JSONObject jSONObject = parseObject.getJSONObject("data");
                    final String string = jSONObject.getString("leftBtn");
                    String string2 = jSONObject.getString("rightBtn");
                    String string3 = jSONObject.getString("centerConfig");
                    final boolean booleanValue = jSONObject.getBooleanValue("disableGradient");
                    final String string4 = jSONObject.getString("navColor");
                    final String string5 = jSONObject.getString("navImage");
                    final int floatValue = ((int) jSONObject.getFloatValue("opacity")) * 255;
                    JSONObject jSONObject2 = parseObject.getJSONObject("callbacks");
                    final String string6 = jSONObject2.getString("onLeftClick");
                    final String string7 = jSONObject2.getString("onRightClick");
                    LogUtil.record(4, "NavBarPlugin leftCallback:rightCallback", string6 + " " + string7);
                    LogUtil.record(4, "NavBarPlugin leftBtn:rightLabel", string + " " + string2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.mBizId);
                    sb.append(" ");
                    LogUtil.record(4, "mBizId", sb.toString());
                    final MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
                    final NavBarClickAction navBarClickAction = new NavBarClickAction() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.ui.base.NavBarClickAction
                        public void onClick() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("88f782f0", new Object[]{this});
                                return;
                            }
                            String str3 = string6;
                            if (str3 == null) {
                                return;
                            }
                            LogUtil.record(4, "NavBarPlugin nativeExecuteJs leftCallback", str3);
                            MspContext mspContext = mspContextByBizId;
                            if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                                FBPluginCtx access$000 = NavBarPlugin.access$000(NavBarPlugin.this);
                                access$000.nativeExecuteJs(string6 + "&&" + string6 + "();");
                                return;
                            }
                            FBPluginCtx access$0002 = NavBarPlugin.access$000(NavBarPlugin.this);
                            access$0002.safeExecuteJs(string6 + "&&" + string6 + "();");
                        }
                    };
                    NavBarClickAction navBarClickAction2 = new NavBarClickAction() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.ui.base.NavBarClickAction
                        public void onClick() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("88f782f0", new Object[]{this});
                                return;
                            }
                            String str3 = string7;
                            if (str3 == null) {
                                return;
                            }
                            LogUtil.record(4, "NavBarPlugin nativeExecuteJs rightCallback", str3);
                            MspContext mspContext = mspContextByBizId;
                            if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                                FBPluginCtx access$000 = NavBarPlugin.access$000(NavBarPlugin.this);
                                access$000.nativeExecuteJs(string7 + "&&" + string7 + "();");
                                return;
                            }
                            FBPluginCtx access$0002 = NavBarPlugin.access$000(NavBarPlugin.this);
                            access$0002.safeExecuteJs(string7 + "&&" + string7 + "();");
                        }
                    };
                    if (mspContextByBizId == null) {
                        return true;
                    }
                    final MspUIClient mspUIClient = mspContextByBizId.getMspUIClient();
                    if ((mspUIClient instanceof MspWindowClient) && (containerPresenter = ((MspWindowClient) mspUIClient).getContainerPresenter()) != null && containerPresenter.mo545getIView() != null) {
                        containerPresenter.mo545getIView().showNavButton(string, navBarClickAction, string2, navBarClickAction2, string3, new OnNavBarShownListener() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.OnNavBarShownListener
                            public void onNavBarShown() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("2785329", new Object[]{this});
                                    return;
                                }
                                try {
                                    if (containerPresenter.mo545getIView() == null) {
                                        return;
                                    }
                                    NavBarPlugin.access$102(NavBarPlugin.this, containerPresenter.mo545getIView().getCurFlybirdView());
                                    if (mspUIClient.getCurrentPresenter() != null && mspUIClient.getCurrentPresenter().mo545getIView() != null) {
                                        NavBarPlugin.access$202(NavBarPlugin.this, mspUIClient.getCurrentPresenter().getActivity().findViewById(R.id.rl_nav_bar));
                                        String str3 = string4;
                                        if (StringUtils.isEmpty(str3)) {
                                            str3 = "#ffffff";
                                        }
                                        NavBarPlugin.access$300(NavBarPlugin.this, string, navBarClickAction);
                                        if (!StringUtils.isEmpty(string5)) {
                                            final ImageView imageView = new ImageView(NavBarPlugin.access$400(NavBarPlugin.this));
                                            imageView.setLayoutParams(new ViewGroup.LayoutParams(1080, 1960));
                                            imageView.setScaleType(ImageView.ScaleType.FIT_START);
                                            ResUtils.loadImage((FBDocument) PluginManager.getRender().getFbContextFromView(NavBarPlugin.access$100(NavBarPlugin.this)), imageView, string5, null, null, new BirdNestEngine.ResourceProvider.Callback() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.3.1
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                                                public void onLoadFailure(int i, int i2, Object obj) {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i), new Integer(i2), obj});
                                                    }
                                                }

                                                @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                                                public void onLoadSuccess(int i, int i2, Object obj) {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("a1462621", new Object[]{this, new Integer(i), new Integer(i2), obj});
                                                        return;
                                                    }
                                                    NavBarPlugin.access$500(NavBarPlugin.this, ((BitmapDrawable) imageView.getDrawable()).getBitmap());
                                                    NavBarPlugin.access$600(NavBarPlugin.this, floatValue);
                                                }
                                            }, mspContextByBizId != null && mspContextByBizId.isUseSafeJsExecute());
                                            NavBarPlugin.access$500(NavBarPlugin.this, ((BitmapDrawable) imageView.getDrawable()).getBitmap());
                                        } else {
                                            NavBarPlugin.access$200(NavBarPlugin.this).setBackgroundColor(Color.parseColor(str3));
                                        }
                                        NavBarPlugin.access$600(NavBarPlugin.this, floatValue);
                                        if (booleanValue) {
                                            return;
                                        }
                                        if (NavBarPlugin.access$100(NavBarPlugin.this) instanceof RelativeLayout) {
                                            NavBarPlugin.access$102(NavBarPlugin.this, ((RelativeLayout) NavBarPlugin.access$100(NavBarPlugin.this)).getChildAt(0));
                                        }
                                        if (!(NavBarPlugin.access$100(NavBarPlugin.this) instanceof FBRootFrameLayout)) {
                                            return;
                                        }
                                        FBFrameLayout fBFrameLayout = (FBFrameLayout) ((FBRootFrameLayout) NavBarPlugin.access$100(NavBarPlugin.this)).getChildAt(0);
                                        int childCount = fBFrameLayout.getChildCount();
                                        for (int i = 0; i < childCount; i++) {
                                            View childAt = fBFrameLayout.getChildAt(i);
                                            if (childAt instanceof FBScrollView) {
                                                NavBarPlugin.access$700(NavBarPlugin.this, (FBScrollView) childAt);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    LogUtil.printExceptionStackTrace(e);
                                }
                            }
                        });
                    }
                }
                return true;
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return true;
    }

    private void genLeftBtn(String str, final NavBarClickAction navBarClickAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130bb596", new Object[]{this, str, navBarClickAction});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            if (!parseObject.containsKey("type")) {
                return;
            }
            String string = parseObject.getString("type");
            if (StringUtils.equals(string, "text")) {
                this.mNavBarView.findViewById(R.id.nav_left_imageview).setVisibility(8);
            } else if (!StringUtils.equals(string, "image") || !parseObject.containsKey("image")) {
            } else {
                this.mNavBarView.findViewById(R.id.nav_left_textview).setVisibility(8);
                ImageView imageView = (ImageView) this.mNavBarView.findViewById(R.id.nav_left_imageview);
                imageView.setVisibility(0);
                String string2 = parseObject.getString("image");
                try {
                    if (parseObject.containsKey("imageSize")) {
                        int dip2px = ResUtils.dip2px(this.mContext, parseObject.getIntValue("imageSize"));
                        imageView.getLayoutParams().height = dip2px;
                        imageView.getLayoutParams().width = dip2px;
                    }
                    FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(this.mCurFlybirdView);
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
                    ResUtils.loadImage((FBDocument) fbContextFromView, imageView, string2, null, null, mspContextByBizId != null && mspContextByBizId.isUseSafeJsExecute());
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            NavBarClickAction navBarClickAction2 = navBarClickAction;
                            if (navBarClickAction2 == null) {
                                return;
                            }
                            navBarClickAction2.onClick();
                        }
                    });
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }
    }

    private void setBackGroundImage(final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751ad37c", new Object[]{this, bitmap});
        } else if (bitmap == null) {
        } else {
            this.mNavBarView.post(new Runnable() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        int height = NavBarPlugin.access$200(NavBarPlugin.this).getHeight();
                        if (height <= 0) {
                            height = ResUtils.dip2px(NavBarPlugin.access$400(NavBarPlugin.this), 47.0f);
                        }
                        NavBarPlugin.access$200(NavBarPlugin.this).setBackgroundDrawable(new BitmapDrawable(NavBarPlugin.access$400(NavBarPlugin.this).getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), (height * bitmap.getWidth()) / NavBarPlugin.access$200(NavBarPlugin.this).getWidth(), (Matrix) null, false)));
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    private void setScrollListener(FBScrollView fBScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae7537a", new Object[]{this, fBScrollView});
        } else if (this.mFBScrollViewListener != null) {
        } else {
            this.mFBScrollViewListener = new FBScrollView.FBScrollViewListener() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.flybird.FBScrollView.FBScrollViewListener
                public void onScrollBegin(int i, int i2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4d7cff70", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                    }
                }

                @Override // com.flybird.FBScrollView.FBScrollViewListener
                public void onScrollEnd(int i, int i2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c054adfe", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                    }
                }

                @Override // com.flybird.FBScrollView.FBScrollViewListener
                public void onScrollStop(int i, int i2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5488451f", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                    }
                }

                @Override // com.flybird.FBScrollView.FBScrollViewListener
                public void onScrollChanged(int i, int i2, int i3, int i4, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3f8bab65", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                    } else {
                        NavBarPlugin.access$800(NavBarPlugin.this, i2);
                    }
                }
            };
            fBScrollView.addAdditionalScrollViewListener(this.mFBScrollViewListener);
        }
    }

    private void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.mNavBarView.getBackground() == null) {
                return;
            }
            this.mNavBarView.getBackground().setAlpha(i);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private void onFBScrollChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762112d0", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (i <= 0) {
                setAlpha(0);
            } else if (i <= 150) {
                setAlpha((int) ((i / 150.0f) * 249.0f));
            } else {
                setAlpha(249);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        unregisterNavBarReceiver(this.mContext);
    }

    private void unregisterNavBarReceiver(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962eb5a6", new Object[]{this, context});
            return;
        }
        LogUtil.record(1, "NavBarPlugin", "unregisterNavBarReceiver");
        try {
            if (this.mReceiver != null) {
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this.mReceiver);
            }
        } catch (Throwable th) {
            LogUtil.record(8, "unregisterNavBarReceiver", th.getMessage());
        }
        this.mReceiver = null;
    }

    private void registerNavBarReceiver(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574940df", new Object[]{this, context});
            return;
        }
        unregisterNavBarReceiver(context);
        LogUtil.record(1, "NavBarPlugin", "registerNavBarReceiver");
        this.mReceiver = new BroadcastReceiver() { // from class: com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (NavBarPlugin.access$900(NavBarPlugin.this) == null) {
                    LogUtil.record(1, "NavBarPlugin", "mReceiver onReceive:receiver has been unregister, ignore");
                } else {
                    LogUtil.record(1, "NavBarPlugin", "mReceiver onReceive:" + intent.getAction() + ", mFBPluginCtx=" + NavBarPlugin.access$000(NavBarPlugin.this));
                    if (NavBarPlugin.access$000(NavBarPlugin.this) == null) {
                        return;
                    }
                    LogUtil.record(1, "NavBarPlugin", "nativeExecuteJs:jsInstruction = document.appPause&&document.appPause()");
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(NavBarPlugin.access$1000(NavBarPlugin.this));
                    if (mspContextByBizId == null || !mspContextByBizId.isUseSafeJsExecute()) {
                        LogUtil.record(1, "NavBarPlugin", "nativeExecuteJs:result =".concat(String.valueOf(NavBarPlugin.access$000(NavBarPlugin.this).nativeExecuteJs("document.appPause&&document.appPause()"))));
                    } else {
                        NavBarPlugin.access$000(NavBarPlugin.this).safeExecuteJs("document.appPause&&document.appPause()");
                    }
                    LogUtil.record(1, "checkEbank", "Js exec" + System.currentTimeMillis());
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT);
            LocalBroadcastManager.getInstance(context).registerReceiver(this.mReceiver, intentFilter);
        } catch (Throwable th) {
            LogUtil.record(8, "unregisterNavBarReceiver", th.getMessage());
        }
    }

    @Override // com.alipay.mobile.beehive.eventbus.IEventSubscriber
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!StringUtils.equals(str, MspGlobalDefine.EVENT_CONTAINER_FINISH) || this.mBizId != ((Integer) obj).intValue()) {
        } else {
            EventBusManager.getInstance().unregister(this);
            unregisterNavBarReceiver(this.mContext);
        }
    }
}
