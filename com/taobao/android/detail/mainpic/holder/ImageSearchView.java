package com.taobao.android.detail.mainpic.holder;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Outline;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.device.UTDevice;
import tb.acg;
import tb.epo;

/* loaded from: classes4.dex */
public class ImageSearchView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean sRainbowInited = false;
    private TUrlImageView mIvArrow;
    private TUrlImageView mIvNew;
    private TUrlImageView mIvQuery;

    public static /* synthetic */ Object ipc$super(ImageSearchView imageSearchView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(ImageSearchView imageSearchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b71f18", new Object[]{imageSearchView});
        } else {
            imageSearchView.markQueryUsed();
        }
    }

    public static /* synthetic */ TUrlImageView access$100(ImageSearchView imageSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("799fe043", new Object[]{imageSearchView}) : imageSearchView.mIvNew;
    }

    private static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (sRainbowInited) {
        } else {
            try {
                com.taobao.search.rainbow.a.a(getAppVersion(context), UTDevice.getUtdid(context), acg.a());
                com.taobao.search.rainbow.a.b();
                sRainbowInited = true;
            } catch (Exception unused) {
            }
        }
    }

    private static String getAppVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{context});
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.taobao.taobao", 0).versionName;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public ImageSearchView(Context context) {
        super(context);
        initViews();
    }

    private void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View.inflate(getContext(), R.layout.main_pic_image_query, this);
        this.mIvNew = (TUrlImageView) findViewById(R.id.iv_new);
        this.mIvQuery = (TUrlImageView) findViewById(R.id.iv_query_icon);
        this.mIvArrow = (TUrlImageView) findViewById(R.id.iv_arrow);
        this.mIvArrow.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01mfYeEg1zbIxz1wlyA_!!6000000006732-2-tps-24-40.png");
        this.mIvQuery.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01gIf7KB1yzI5op2bo6_!!6000000006649-2-tps-84-80.png");
        this.mIvNew.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN017qeDsr1vbWhBH2mRP_!!6000000006191-2-tps-68-64.png");
        setBackgroundResource(R.drawable.main_pic_combtn_click);
        int i = 8;
        if (!isNewFlagEnable()) {
            this.mIvNew.setVisibility(8);
        } else {
            TUrlImageView tUrlImageView = this.mIvNew;
            if (!isQueryUsedBefore()) {
                i = 0;
            }
            tUrlImageView.setVisibility(i);
        }
        TextView textView = (TextView) findViewById(R.id.tv_slogan);
        if (textView == null) {
            return;
        }
        textView.setText(getSlogan());
    }

    private boolean isQueryUsedBefore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc479985", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("lightoff_img_query", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("img_query", false);
        }
        return false;
    }

    private void markQueryUsed() {
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60edcdf", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("lightoff_img_query", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putBoolean("img_query", true).apply();
    }

    private boolean isNewFlagEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b8ebed0", new Object[]{this})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("image_search", "detail_new_flag", "false");
        return TextUtils.isEmpty(config) || TextUtils.equals(config, "true");
    }

    public void addToParent(LinearLayout linearLayout, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e0863f", new Object[]{this, linearLayout, onClickListener});
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            linearLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.mainpic.holder.ImageSearchView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ImageSearchView.this.getResources().getDimensionPixelSize(R.dimen.main_pic_view_radius));
                    }
                }
            });
            linearLayout.setClipToOutline(true);
        }
        View view = new View(getContext());
        view.setClickable(false);
        view.setFocusable(false);
        view.setBackgroundColor(Color.parseColor("#dddddd"));
        linearLayout.addView(view, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 1.0f)));
        linearLayout.addView(this, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f)));
        setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.holder.ImageSearchView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view2);
                }
                ImageSearchView.access$000(ImageSearchView.this);
                ImageSearchView.access$100(ImageSearchView.this).setVisibility(8);
            }
        });
    }

    private static boolean isAbEnable() {
        String a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a41315d9", new Object[0])).booleanValue() : sRainbowInited && (a2 = com.taobao.search.rainbow.a.a("tbAndroidPltDetailQuery")) != null && a2.contains("enable");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0.equals("enable2") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getSlogan() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.mainpic.holder.ImageSearchView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "64cb5aa5"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            boolean r0 = com.taobao.android.detail.mainpic.holder.ImageSearchView.sRainbowInited
            java.lang.String r1 = "搜索图片同款商品"
            if (r0 != 0) goto L1a
            return r1
        L1a:
            java.lang.String r0 = "tbAndroidPltDetailQuery"
            java.lang.String r0 = com.taobao.search.rainbow.a.a(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L27
            return r1
        L27:
            r3 = -1
            int r4 = r0.hashCode()
            r5 = 1
            switch(r4) {
                case -1609594098: goto L3a;
                case -1609594097: goto L31;
                default: goto L30;
            }
        L30:
            goto L44
        L31:
            java.lang.String r4 = "enable2"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L44
            goto L45
        L3a:
            java.lang.String r2 = "enable1"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L44
            r2 = 1
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L4c
            java.lang.String r0 = ""
            return r0
        L4c:
            return r1
        L4d:
            java.lang.String r0 = "拍照搜同款"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.mainpic.holder.ImageSearchView.getSlogan():java.lang.String");
    }

    public static boolean isEnable(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5890100c", new Object[]{context, str, str2})).booleanValue();
        }
        init(context);
        if (!isAbEnable()) {
            return false;
        }
        String config = OrangeConfig.getInstance().getConfig("android_detail", "detail_black_list", "");
        if (TextUtils.isEmpty(config)) {
            return true;
        }
        try {
            JSONObject parseObject = JSON.parseObject(config);
            String string = parseObject.getString("itemBlackList");
            boolean contains = (string == null || str == null) ? false : string.contains(str);
            if (contains) {
                return false;
            }
            String string2 = parseObject.getString("sellerBlackList");
            if (string2 != null && str2 != null) {
                contains = string2.contains(str2);
            }
            return !contains;
        } catch (Exception unused) {
            return false;
        }
    }
}
