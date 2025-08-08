package com.alipay.android.msp.biz.substitute;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.minizxing.BarcodeFormat;
import com.alipay.android.msp.framework.minizxing.ErrorCorrectionLevel;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.ui.views.AbsActivity;
import com.alipay.android.msp.utils.BitmapUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.NumUtil;
import com.alipay.android.msp.utils.ZXingHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import java.net.URLDecoder;
import tb.riy;

/* loaded from: classes3.dex */
public class MspPaycodeChannelActivity extends AbsActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f4463a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Bitmap j;
    private boolean k;
    private String l;
    private String m;
    private boolean n;
    private long o = 0;
    private String p = "";

    public static /* synthetic */ Object ipc$super(MspPaycodeChannelActivity mspPaycodeChannelActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ Bitmap a(MspPaycodeChannelActivity mspPaycodeChannelActivity, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e51569d", new Object[]{mspPaycodeChannelActivity, bitmap});
        }
        mspPaycodeChannelActivity.j = bitmap;
        return bitmap;
    }

    public static /* synthetic */ String a(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dac79031", new Object[]{mspPaycodeChannelActivity}) : mspPaycodeChannelActivity.p;
    }

    public static /* synthetic */ int b(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98c50ce1", new Object[]{mspPaycodeChannelActivity})).intValue() : mspPaycodeChannelActivity.f4463a;
    }

    public static /* synthetic */ String c(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b7d5b2b3", new Object[]{mspPaycodeChannelActivity}) : mspPaycodeChannelActivity.m;
    }

    public static /* synthetic */ String d(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("265cc3f4", new Object[]{mspPaycodeChannelActivity}) : mspPaycodeChannelActivity.i;
    }

    public static /* synthetic */ Bitmap e(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("98758ca9", new Object[]{mspPaycodeChannelActivity}) : mspPaycodeChannelActivity.j;
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MspWindowClient mspWindowClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        LogUtil.record(1, "PaycodeChannel", i.b.MEASURE_ONCREATE);
        try {
            if (Build.VERSION.SDK_INT != 26) {
                setRequestedOrientation(1);
            }
        } catch (Throwable th) {
            LogUtil.record(1, "MspPaycodeChannelActivity:oncreate", "failed to set orientation");
            LogUtil.printExceptionStackTrace(th);
        }
        if (GlobalHelper.getInstance().getContext() == null) {
            GlobalHelper.getInstance().init(this);
        }
        setContentView(R.layout.substitute_paycode_activity);
        Intent intent = getIntent();
        this.f4463a = intent.getIntExtra("bizId", -1);
        this.i = intent.getStringExtra("avatar");
        this.b = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_SHOWNAME);
        this.c = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_REALNAME);
        this.d = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN);
        this.e = intent.getStringExtra("amount");
        this.f = intent.getStringExtra("desc");
        this.g = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_CODEURL);
        this.h = intent.getStringExtra(SubstituteConstants.KEY_SUBSTITUTE_PAY_TIME);
        if (this.h == null) {
            this.h = "";
        }
        this.k = intent.getBooleanExtra(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON, false);
        this.m = intent.getStringExtra(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_LINK);
        this.l = intent.getStringExtra(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_NAME);
        this.n = intent.getBooleanExtra("needExit", false);
        LogUtil.record(1, "PaycodeChannel", "Params#avatar:" + this.i);
        LogUtil.record(1, "PaycodeChannel", "Params#showname:" + this.b);
        LogUtil.record(1, "PaycodeChannel", "Params#realname:" + this.c);
        LogUtil.record(1, "PaycodeChannel", "Params#slogan:" + this.d);
        LogUtil.record(1, "PaycodeChannel", "Params#amount:" + this.e);
        LogUtil.record(1, "PaycodeChannel", "Params#desc:" + this.f);
        LogUtil.record(1, "PaycodeChannel", "Params#codeurl:" + this.g);
        LogUtil.record(1, "PaycodeChannel", "Params#codetime:" + this.h);
        LogUtil.record(1, "PaycodeChannel", "Params#codeDLBtn:" + this.k);
        LogUtil.record(1, "PaycodeChannel", "Params#codeDLBtnLink:" + this.m);
        LogUtil.record(1, "PaycodeChannel", "Params#codeDLBtnName:" + this.l);
        LogUtil.record(1, "PaycodeChannel", "Params#needExit:" + this.n);
        this.p = "a283.b5824__" + GlobalHelper.getInstance().getUtdid(this) + "__" + NumUtil.c10to64(System.currentTimeMillis()) + "_";
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.f4463a);
        final MspWindowFrame mspWindowFrame = null;
        if (tradeContextByBizId != null && (mspWindowClient = (MspWindowClient) tradeContextByBizId.getMspUIClient()) != null) {
            mspWindowFrame = mspWindowClient.getFrameStack().getTopTplOrNativeFrame();
        }
        SpmHelper.saveNativePageSpm(this, SpmHelper.Page.Subpay_Paycode, SpmHelper.PageState.Start, this.p, "0", this.f4463a, mspWindowFrame);
        this.o = SystemClock.elapsedRealtime();
        View findViewById = findViewById(R.id.title_back_layout);
        findViewById.setContentDescription(LanguageHelper.localizedStringForKey("accessibilty_back_button", getString(R.string.accessibilty_back_button), new Object[0]));
        ((TextView) findViewById(R.id.mini_web_title)).setText(LanguageHelper.localizedStringForKey("substitute_paycode_title", getString(R.string.substitute_paycode_title), new Object[0]));
        ((TextView) findViewById(R.id.tv_download_layout_hint)).setText(LanguageHelper.localizedStringForKey("substitute_download_hint", getString(R.string.substitute_download_hint), new Object[0]));
        ((TextView) findViewById(R.id.download_button_name)).setText(LanguageHelper.localizedStringForKey("substitute_download_text", getString(R.string.substitute_download_text), new Object[0]));
        SpmHelper.saveNativeControlSpm(this, SpmHelper.Control.Subpay_Paycode_BACK, SpmHelper.Action.Exposure, this.p, this.f4463a, mspWindowFrame);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                SpmHelper.saveNativeControlSpm(MspPaycodeChannelActivity.this, SpmHelper.Control.Subpay_Paycode_BACK, SpmHelper.Action.Clicked, MspPaycodeChannelActivity.a(MspPaycodeChannelActivity.this), MspPaycodeChannelActivity.b(MspPaycodeChannelActivity.this), mspWindowFrame);
                MspPaycodeChannelActivity.this.onBackPressed();
            }
        });
        TextView textView = (TextView) findViewById(R.id.substitute_paycode_user_desc);
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(this.b)) {
            sb.append(this.b);
        }
        if (!StringUtils.isEmpty(this.c)) {
            sb.append(riy.BRACKET_START_STR);
            sb.append(this.c);
            sb.append(riy.BRACKET_END_STR);
        }
        if (sb.length() != 0) {
            sb.append("：");
        }
        sb.append(this.d);
        textView.setText(sb.toString());
        ((TextView) findViewById(R.id.substitute_paycode_trade_price)).setText(this.e);
        ((TextView) findViewById(R.id.substitute_paycode_trade_desc)).setText(this.f);
        String localizedStringForKey = LanguageHelper.localizedStringForKey("qrcode_desc_prefix", getString(R.string.qrcode_desc_prefix), new Object[0]);
        String str = localizedStringForKey + this.h + LanguageHelper.localizedStringForKey("qrcode_desc_suffix", getString(R.string.qrcode_desc_suffix), new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-7829368);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(-445377);
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, localizedStringForKey.length(), 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, localizedStringForKey.length(), localizedStringForKey.length() + this.h.length(), 18);
        spannableStringBuilder.setSpan(foregroundColorSpan, localizedStringForKey.length() + this.h.length(), str.length(), 33);
        ((TextView) findViewById(R.id.substitute_paycode_qrcode_desc)).setText(spannableStringBuilder);
        View findViewById2 = findViewById(R.id.download_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById(R.id.substitute_paycode_layout).getLayoutParams();
        if (this.k) {
            findViewById2.setVisibility(0);
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, 42);
            SpmHelper.saveNativeControlSpm(this, SpmHelper.Control.Subpay_Paycode_Download, SpmHelper.Action.Exposure, this.p, this.f4463a, mspWindowFrame);
            ((ImageButton) findViewById(R.id.download_button)).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(URLDecoder.decode(MspPaycodeChannelActivity.c(MspPaycodeChannelActivity.this))));
                    intent2.addCategory("android.intent.category.BROWSABLE");
                    MspPaycodeChannelActivity.this.startActivity(intent2);
                    SpmHelper.saveNativeControlSpm(MspPaycodeChannelActivity.this, SpmHelper.Control.Subpay_Paycode_Download, SpmHelper.Action.Clicked, MspPaycodeChannelActivity.a(MspPaycodeChannelActivity.this), MspPaycodeChannelActivity.b(MspPaycodeChannelActivity.this), mspWindowFrame);
                }
            });
            ((TextView) findViewById(R.id.download_button_name)).setText(this.l);
            return;
        }
        findViewById2.setVisibility(8);
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, 102);
    }

    @Override // android.app.Activity
    public void finish() {
        MspWindowClient mspWindowClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        LogUtil.record(1, "PaycodeChannel", "finish");
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.f4463a);
        if (tradeContextByBizId != null && (mspWindowClient = (MspWindowClient) tradeContextByBizId.getMspUIClient()) != null) {
            SpmHelper.Page page = SpmHelper.Page.Subpay_Paycode;
            SpmHelper.PageState pageState = SpmHelper.PageState.End;
            String str = this.p;
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime() - this.o);
            SpmHelper.saveNativePageSpm(this, page, pageState, str, sb.toString(), this.f4463a, mspWindowClient.getFrameStack().getTopTplOrNativeFrame());
        }
        if (!this.n || tradeContextByBizId == null) {
            return;
        }
        MspPayResult mspPayResult = tradeContextByBizId.getMspPayResult();
        if (mspPayResult != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ResultStatus.PAY_IGNORE_CODE.getStatus());
            mspPayResult.setEndCode(sb2.toString());
        }
        tradeContextByBizId.exit(0);
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LogUtil.record(1, "PaycodeChannel", MessageID.onDestroy);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LogUtil.record(1, "PaycodeChannel", "onResume");
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!StringUtils.isEmpty(MspPaycodeChannelActivity.d(MspPaycodeChannelActivity.this))) {
                    MspPaycodeChannelActivity mspPaycodeChannelActivity = MspPaycodeChannelActivity.this;
                    MspPaycodeChannelActivity.a(mspPaycodeChannelActivity, BitmapUtil.getHttpBitmap(MspPaycodeChannelActivity.d(mspPaycodeChannelActivity)));
                }
                StringBuilder sb = new StringBuilder("getHttpBitmap:mUserAvatarUrl=");
                sb.append(MspPaycodeChannelActivity.d(MspPaycodeChannelActivity.this));
                sb.append(", bitmap_is_null=");
                if (MspPaycodeChannelActivity.e(MspPaycodeChannelActivity.this) == null) {
                    z = true;
                }
                sb.append(z);
                LogUtil.record(1, "PaycodeChannel", sb.toString());
                MspPaycodeChannelActivity mspPaycodeChannelActivity2 = MspPaycodeChannelActivity.this;
                final Bitmap b = MspPaycodeChannelActivity.b(mspPaycodeChannelActivity2, MspPaycodeChannelActivity.e(mspPaycodeChannelActivity2));
                final Bitmap f = MspPaycodeChannelActivity.f(MspPaycodeChannelActivity.this);
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ((ImageView) MspPaycodeChannelActivity.this.findViewById(R.id.substitute_paycode_user_img)).setImageBitmap(b);
                        ((ImageView) MspPaycodeChannelActivity.this.findViewById(R.id.substitute_paycode_qrcode_img)).setImageBitmap(f);
                        MspPaycodeChannelActivity.g(MspPaycodeChannelActivity.this);
                    }
                });
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        LogUtil.record(1, "PaycodeChannel", "onBackPressed");
        finish();
    }

    private static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics().density);
    }

    public static /* synthetic */ Bitmap b(MspPaycodeChannelActivity mspPaycodeChannelActivity, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e81b23de", new Object[]{mspPaycodeChannelActivity, bitmap});
        }
        if (bitmap != null) {
            return BitmapUtil.getRoundedBitmap(BitmapUtil.zoomImage(mspPaycodeChannelActivity.j, 135, 135), 12);
        }
        return BitmapUtil.getRoundedBitmap(BitmapFactory.decodeResource(mspPaycodeChannelActivity.getResources(), R.drawable.alipay_substitute_user_default), 12);
    }

    public static /* synthetic */ Bitmap f(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6835c048", new Object[]{mspPaycodeChannelActivity});
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(mspPaycodeChannelActivity.getResources(), R.drawable.alipay_substitute_logo);
        int a2 = a(mspPaycodeChannelActivity, 220.0f);
        int a3 = a(mspPaycodeChannelActivity, 220.0f);
        LogUtil.record(1, "PaycodeChannel", "paycodeWidth:".concat(String.valueOf(a2)));
        LogUtil.record(1, "PaycodeChannel", "paycodeHeight:".concat(String.valueOf(a3)));
        return ZXingHelper.createCodeBitmap(mspPaycodeChannelActivity.g, BarcodeFormat.QR_CODE, -789518, a2, a3, ErrorCorrectionLevel.Q, decodeResource, -16777216);
    }

    public static /* synthetic */ void g(MspPaycodeChannelActivity mspPaycodeChannelActivity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b526f009", new Object[]{mspPaycodeChannelActivity});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mspPaycodeChannelActivity.findViewById(R.id.substitute_paycode_qrcode_layout);
        ImageView imageView = (ImageView) mspPaycodeChannelActivity.findViewById(R.id.substitute_paycode_qrcode_img);
        TextView textView = (TextView) mspPaycodeChannelActivity.findViewById(R.id.substitute_paycode_qrcode_desc);
        if (imageView.getWidth() != imageView.getHeight()) {
            int width = imageView.getWidth() < imageView.getHeight() ? imageView.getWidth() : imageView.getHeight();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = width;
            layoutParams.width = width;
            imageView.setLayoutParams(layoutParams);
        }
        if (textView.getBottom() > relativeLayout.getHeight() || (((int) textView.getTextSize()) << 1) > textView.getHeight()) {
            textView.setPadding(textView.getPaddingLeft() / 3, textView.getPaddingTop(), textView.getPaddingRight() / 3, textView.getPaddingBottom());
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        if (textView.getBottom() > relativeLayout.getHeight()) {
            i = ((((layoutParams2.topMargin + layoutParams3.topMargin) + layoutParams3.bottomMargin) + relativeLayout.getHeight()) - textView.getBottom()) / 3;
        } else {
            i = ((layoutParams2.topMargin + layoutParams3.topMargin) + layoutParams3.bottomMargin) / 3;
        }
        layoutParams2.setMargins(layoutParams2.leftMargin, i, layoutParams2.rightMargin, layoutParams2.bottomMargin);
        imageView.setLayoutParams(layoutParams2);
        layoutParams3.setMargins(layoutParams3.leftMargin, i, layoutParams3.rightMargin, i);
        textView.setLayoutParams(layoutParams3);
    }
}
