package com.taobao.tao.longpic;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.runtimepermission.f;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.longpic.SnapshotTargetView;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.utils.ShareUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;
import tb.nyg;
import tb.nyk;
import tb.nym;
import tb.nyq;
import tb.nyr;
import tb.nyu;
import tb.oba;
import tb.obc;
import tb.obi;
import tb.obl;
import tb.oik;

/* loaded from: classes8.dex */
public class ShareNewQRCodeView implements PopupWindow.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String GEN3_CODE_WHITE_BG_URL = null;
    private static String QR_BASE_WIDTH = null;
    private static String QR_HEIGHT = null;
    private static String QR_LEFT = null;
    private static String[] QR_PARAMS = null;
    private static String QR_TEMPLATE = null;
    private static String QR_TOP = null;
    private static String QR_URL = null;
    private static String QR_WIDTH = null;
    public static String TAO_LOGO_URL = null;
    private static final String TEXT_COLOR = "color";
    private static final String TEXT_INFO = "content";
    private static final String TEXT_SIZE = "size";
    private static final int TEXT_SIZE_BIG = 18;
    private static final int TEXT_SIZE_NORMAL = 16;
    private static final int TEXT_SIZE_SMALL = 12;
    private static final String TYPE = "type";
    private LinearLayout bottomViews;
    private Animation dismissAnimation;
    private FrameLayout frameLayout;
    private LayoutInflater inflater;
    private LinearLayout linearLayout;
    private a listener;
    private Context mContext;
    private TextView mCopyRightView;
    private PopupWindow mPopupWindow;
    private Bitmap mQRBitmap;
    private TUrlImageView mQRCodeLogoView;
    private View mQRCodeView;
    private TextView mQrCodeDesp1View;
    private TextView mQrCodeDesp2View;
    private TextView mQrTipsTextView;
    private String mShareUrl;
    private View mView;
    private View progressLayout;
    private Animation showAnimation;
    private boolean mGetBitmapFinish = false;
    private ArrayList<ImageView> qrImageViews = new ArrayList<>();
    private String taoLongPicCode = "qrcode";
    private String isSuperUser = "0";
    private boolean isShowShareDialog = false;
    private boolean isDoShareProgress = false;
    private SnapshotTargetView.b shareListener = new SnapshotTargetView.b() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.longpic.SnapshotTargetView.b
        public void a(String str, ShareData shareData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f40da699", new Object[]{this, str, shareData});
                return;
            }
            View findViewById = ShareNewQRCodeView.access$1400(ShareNewQRCodeView.this).findViewById(R.id.snapshot_main_layout);
            if (obl.b()) {
                ShareNewQRCodeView.access$1500(ShareNewQRCodeView.this, findViewById, str, shareData);
            } else {
                ShareNewQRCodeView.access$1600(ShareNewQRCodeView.this, findViewById, str, shareData);
            }
        }
    };
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* loaded from: classes8.dex */
    public interface a {
    }

    public static /* synthetic */ PopupWindow access$000(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("a26cba3f", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.mPopupWindow;
    }

    public static /* synthetic */ int access$100(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f929e367", new Object[]{shareNewQRCodeView})).intValue() : shareNewQRCodeView.getWindowWidth();
    }

    public static /* synthetic */ void access$1000(ShareNewQRCodeView shareNewQRCodeView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb0dc28", new Object[]{shareNewQRCodeView, bitmap});
        } else {
            shareNewQRCodeView.dealQRImages(bitmap);
        }
    }

    public static /* synthetic */ View access$1100(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2382b7e7", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.mQRCodeView;
    }

    public static /* synthetic */ a access$1200(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f883edc3", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.listener;
    }

    public static /* synthetic */ void access$1300(ShareNewQRCodeView shareNewQRCodeView, String str, int i, EncodeCallback encodeCallback, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d70b130", new Object[]{shareNewQRCodeView, str, new Integer(i), encodeCallback, bitmap});
        } else {
            shareNewQRCodeView.encodeQrcode(str, i, encodeCallback, bitmap);
        }
    }

    public static /* synthetic */ View access$1400(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f8ccad04", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.mView;
    }

    public static /* synthetic */ void access$1500(ShareNewQRCodeView shareNewQRCodeView, View view, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823cc10", new Object[]{shareNewQRCodeView, view, str, shareData});
        } else {
            shareNewQRCodeView.saveToDCIMAndroid10(view, str, shareData);
        }
    }

    public static /* synthetic */ void access$1600(ShareNewQRCodeView shareNewQRCodeView, View view, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39ee6f", new Object[]{shareNewQRCodeView, view, str, shareData});
        } else {
            shareNewQRCodeView.saveToDCIM(view, str, shareData);
        }
    }

    public static /* synthetic */ boolean access$1700(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c8413a3", new Object[]{shareNewQRCodeView})).booleanValue() : shareNewQRCodeView.isShowShareDialog;
    }

    public static /* synthetic */ boolean access$1702(ShareNewQRCodeView shareNewQRCodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3312471b", new Object[]{shareNewQRCodeView, new Boolean(z)})).booleanValue();
        }
        shareNewQRCodeView.isShowShareDialog = z;
        return z;
    }

    public static /* synthetic */ void access$1800(ShareNewQRCodeView shareNewQRCodeView, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ef1a83", new Object[]{shareNewQRCodeView, str, shareData});
        } else {
            shareNewQRCodeView.doShare(str, shareData);
        }
    }

    public static /* synthetic */ String access$1900(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a71caa63", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.mShareUrl;
    }

    public static /* synthetic */ Context access$200(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2d11f8b", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.mContext;
    }

    public static /* synthetic */ boolean access$2002(ShareNewQRCodeView shareNewQRCodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881d1133", new Object[]{shareNewQRCodeView, new Boolean(z)})).booleanValue();
        }
        shareNewQRCodeView.isDoShareProgress = z;
        return z;
    }

    public static /* synthetic */ void access$2100(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6154ca6", new Object[]{shareNewQRCodeView});
        } else {
            shareNewQRCodeView.sendBroadCast4Tmall();
        }
    }

    public static /* synthetic */ String[] access$2200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("81db1816", new Object[0]) : QR_PARAMS;
    }

    public static /* synthetic */ String access$2300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ee31a58", new Object[0]) : QR_TOP;
    }

    public static /* synthetic */ String access$2400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ae4a937", new Object[0]) : QR_LEFT;
    }

    public static /* synthetic */ String access$2500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46e63816", new Object[0]) : QR_WIDTH;
    }

    public static /* synthetic */ String access$2600() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42e7c6f5", new Object[0]) : QR_HEIGHT;
    }

    public static /* synthetic */ void access$300(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7d2fb2", new Object[]{shareNewQRCodeView});
        } else {
            shareNewQRCodeView.onLoadingFinish();
        }
    }

    public static /* synthetic */ boolean access$402(ShareNewQRCodeView shareNewQRCodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5c7cb29", new Object[]{shareNewQRCodeView, new Boolean(z)})).booleanValue();
        }
        shareNewQRCodeView.mGetBitmapFinish = z;
        return z;
    }

    public static /* synthetic */ Handler access$500(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fcbc4cd6", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.mHandler;
    }

    public static /* synthetic */ Bitmap access$600(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("b374f3ed", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.mQRBitmap;
    }

    public static /* synthetic */ Bitmap access$602(ShareNewQRCodeView shareNewQRCodeView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b4f380df", new Object[]{shareNewQRCodeView, bitmap});
        }
        shareNewQRCodeView.mQRBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$700(ShareNewQRCodeView shareNewQRCodeView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c155b095", new Object[]{shareNewQRCodeView, new Integer(i)});
        } else {
            shareNewQRCodeView.mergerQrcodeBitmap(i);
        }
    }

    public static /* synthetic */ void access$800(ShareNewQRCodeView shareNewQRCodeView, int i, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4856f898", new Object[]{shareNewQRCodeView, new Integer(i), bitmap});
        } else {
            shareNewQRCodeView.doMergerBitmap(i, bitmap);
        }
    }

    public static /* synthetic */ String access$900(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2d8c5b4", new Object[]{shareNewQRCodeView}) : shareNewQRCodeView.taoLongPicCode;
    }

    static {
        kge.a(970040117);
        kge.a(-776969364);
        GEN3_CODE_WHITE_BG_URL = "https://gw.alicdn.com/tfs/TB1pLH_ewMPMeJjy1XdXXasrXXa-520-520.png";
        TAO_LOGO_URL = "https://gw.alicdn.com/tfs/TB17ir_ewMPMeJjy1XdXXasrXXa-200-200.png";
        QR_BASE_WIDTH = "baseWidth";
        QR_TEMPLATE = "template";
        QR_PARAMS = new String[]{"top", "left", "width", "height"};
        QR_TOP = "top";
        QR_LEFT = "left";
        QR_WIDTH = "width";
        QR_HEIGHT = "height";
        QR_URL = "url";
    }

    public ShareNewQRCodeView(Context context) {
        this.mContext = context;
    }

    public void showSnapshotDialog(List<String> list, final ShareData shareData, String str, JSONObject jSONObject, String str2, boolean z, boolean z2, TBShareContent tBShareContent, boolean z3, a aVar) {
        boolean z4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c041a2", new Object[]{this, list, shareData, str, jSONObject, str2, new Boolean(z), new Boolean(z2), tBShareContent, new Boolean(z3), aVar});
            return;
        }
        this.listener = aVar;
        if (this.mPopupWindow != null) {
            return;
        }
        TBS.Ext.commitEvent("Page_QRCode", 19999, "ShowPicView", null, null, "bizID=" + shareData.getBusinessId());
        View h = e.b().h();
        if (h == null) {
            return;
        }
        initAnimation();
        this.inflater = LayoutInflater.from(nym.a().getApplicationContext());
        this.mView = this.inflater.inflate(R.layout.share_longpic_qrcode_view, (ViewGroup) null);
        initTopAndBottomViewByConfig(str2, z, tBShareContent != null ? tBShareContent.disableHeadUrl : false);
        this.mQrTipsTextView = (TextView) this.mView.findViewById(R.id.qr_tips_text);
        if (tBShareContent != null && !TextUtils.isEmpty(tBShareContent.qrTipsTxt)) {
            this.mQrTipsTextView.setText(tBShareContent.qrTipsTxt);
        }
        View findViewById = this.mView.findViewById(R.id.super_user_container);
        if (z3) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        this.frameLayout = (FrameLayout) this.mView.findViewById(R.id.snapshot_defined_layout);
        this.linearLayout = (LinearLayout) this.mView.findViewById(R.id.snapshot_image_layout);
        String sourceType = shareData.getSourceType();
        String text = shareData.getText();
        if (!TextUtils.isEmpty(text) && !z2) {
            if ("shop".equals(sourceType)) {
                TextView textView = (TextView) this.mView.findViewById(R.id.snapshot_title_shop);
                textView.setText(text);
                textView.setVisibility(0);
            } else {
                TextView textView2 = (TextView) this.mView.findViewById(R.id.snapshot_desp);
                textView2.setText(text);
                textView2.setVisibility(0);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = (TextView) this.mView.findViewById(R.id.snapshot_price);
            SpannableStringBuilder buildPrice = buildPrice(str);
            if (!TextUtils.isEmpty(buildPrice)) {
                textView3.setText(buildPrice);
                textView3.setVisibility(0);
            }
        } else {
            this.mView.findViewById(R.id.snapshot_desp_container).setVisibility(8);
        }
        this.mQRCodeLogoView = (TUrlImageView) this.mView.findViewById(R.id.snapshot_qrcode_logo);
        this.mQRCodeLogoView.setVisibility(4);
        String i = obi.b.i();
        if (TextUtils.isEmpty(i)) {
            i = TAO_LOGO_URL;
        }
        if (!ShareBizAdapter.getInstance().getLogin().b() || !TextUtils.equals(obi.a(obi.b.KEY_NEED_SHOW_AVATAR, "false"), "true")) {
            z4 = false;
        } else {
            i = ShareBizAdapter.getInstance().getLogin().c();
            z4 = true;
        }
        loadImage(this.mContext, i, Boolean.valueOf(z4), this.mQRCodeLogoView);
        if (jSONObject == null) {
            generateImagesView(list, sourceType);
        } else {
            generateImageViewWithTemplate(jSONObject);
        }
        String[] split = obi.a(obi.b.KEY_TAO_LONG_COPY, "").split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        if (split.length >= 3) {
            this.mQrCodeDesp1View = (TextView) this.mView.findViewById(R.id.snapshot_qrcode_desp1);
            this.mQrCodeDesp2View = (TextView) this.mView.findViewById(R.id.snapshot_qrcode_desp2);
            this.mCopyRightView = (TextView) this.mView.findViewById(R.id.copyright_announcement);
            this.mQrCodeDesp1View.setText(split[0]);
            this.mQrCodeDesp2View.setText(split[1]);
            this.mCopyRightView.setText(split[2]);
        }
        View findViewById2 = this.mView.findViewById(R.id.snapshot_bar_layout);
        findViewById2.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                return true;
            }
        });
        findViewById2.startAnimation(this.showAnimation);
        buildShareTargets(shareData);
        this.mPopupWindow = new PopupWindow(this.mContext);
        ((TIconFontTextView) this.mView.findViewById(R.id.snapshot_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeCancel", null, null, "bizID=" + shareData.getBusinessId());
                ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
            }
        });
        this.mPopupWindow.setContentView(this.mView);
        this.mPopupWindow.setWidth(-1);
        this.mPopupWindow.setHeight(-1);
        this.mPopupWindow.setFocusable(true);
        this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(this.mContext.getResources().getColor(R.color.half_transparent)));
        try {
            this.mPopupWindow.showAtLocation(h, 81, 0, 0);
        } catch (WindowManager.BadTokenException unused) {
        }
        this.mPopupWindow.setOnDismissListener(this);
        onLoadingStart();
        initAnimation();
    }

    private void initTopAndBottomViewByConfig(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1714aeec", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mQRCodeView = this.mView.findViewById(R.id.snapshot_qrcode);
        TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.head_image);
        tUrlImageView.setStrategyConfig(nyr.f31846a);
        if (z2) {
            tUrlImageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            if ("false".equals(str)) {
                tUrlImageView.setVisibility(8);
            } else {
                tUrlImageView.setImageUrl(str);
            }
        } else {
            String h = obi.b.h();
            if (!TextUtils.isEmpty(h)) {
                tUrlImageView.setImageUrl(h);
            } else {
                tUrlImageView.setVisibility(8);
            }
        }
        this.bottomViews = (LinearLayout) this.mView.findViewById(R.id.snapshot_bottom);
        if (!z) {
            return;
        }
        this.bottomViews.setVisibility(8);
    }

    private void generateImagesView(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae1fa54", new Object[]{this, list, str});
        } else if (list == null || list.size() == 0 || "shop".equals(str)) {
        } else {
            LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.snapshot_image_layout);
            ((FrameLayout) this.mView.findViewById(R.id.snapshot_defined_layout)).setVisibility(8);
            int i2 = 4;
            if (list.size() <= 4) {
                i2 = list.size();
            }
            if (list.size() <= 1) {
                i = 0;
            }
            while (i < i2) {
                final TUrlImageView tUrlImageView = new TUrlImageView(this.mContext);
                tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                tUrlImageView.setVisibility(0);
                tUrlImageView.setImageUrl(list.get(i));
                tUrlImageView.setStrategyConfig(nyr.f31846a);
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                tUrlImageView.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.15
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        TLog.logi("ShareSnapshot", "get images from detail error" + failPhenixEvent.getResultCode());
                        return false;
                    }
                });
                tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.16
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent != null) {
                            BitmapDrawable drawable = succPhenixEvent.getDrawable();
                            int intrinsicWidth = drawable.getIntrinsicWidth();
                            int intrinsicHeight = drawable.getIntrinsicHeight();
                            float access$100 = ShareNewQRCodeView.access$100(ShareNewQRCodeView.this);
                            tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams((int) access$100, (int) ((access$100 / intrinsicWidth) * intrinsicHeight)));
                        }
                        tUrlImageView.setVisibility(0);
                        return true;
                    }
                });
                linearLayout.addView(tUrlImageView);
                i++;
            }
        }
    }

    private void generateImageViewWithTemplate(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2417aa7e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONArray = jSONObject.getJSONArray(QR_TEMPLATE)) != null) {
            int b2 = jSONArray.size() > nyg.b() ? nyg.b() : jSONArray.size();
            if (b2 > 20) {
                b2 = 20;
            }
            float floatValue = jSONObject.getFloat(QR_BASE_WIDTH).floatValue() > 0.0f ? jSONObject.getFloat(QR_BASE_WIDTH).floatValue() : 100.0f;
            for (int i = 0; i < b2; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        String string = jSONObject2.getString("type");
                        if (!TextUtils.isEmpty(string)) {
                            if ("image".equals(string)) {
                                dealImageType(jSONObject2, floatValue, this.frameLayout, this.linearLayout);
                            } else if ("text".equals(string)) {
                                dealTextType(jSONObject2, floatValue, this.frameLayout, this.linearLayout);
                            } else if ("qrCode".equals(string)) {
                                saveQRType(jSONObject2, floatValue);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.frameLayout.getChildCount() == 0) {
                this.frameLayout.setVisibility(8);
            }
            if (this.linearLayout.getChildCount() != 0) {
                return;
            }
            this.linearLayout.setVisibility(8);
        }
    }

    private void dealImageType(JSONObject jSONObject, final float f, FrameLayout frameLayout, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2c4d44", new Object[]{this, jSONObject, new Float(f), frameLayout, linearLayout});
        } else if (jSONObject == null || jSONObject.getString(QR_URL) == null) {
        } else {
            String string = jSONObject.getString(QR_URL);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final TUrlImageView tUrlImageView = new TUrlImageView(this.mContext);
            final c cVar = new c();
            cVar.a(jSONObject);
            tUrlImageView.setVisibility(0);
            tUrlImageView.setImageUrl(string);
            tUrlImageView.setStrategyConfig(nyr.f31846a);
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            tUrlImageView.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    TLog.logi("ShareSnapshot", "get images from detail error" + failPhenixEvent.getResultCode());
                    return false;
                }
            });
            if (cVar.a()) {
                tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(tUrlImageView);
                tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.18
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent != null) {
                            BitmapDrawable drawable = succPhenixEvent.getDrawable();
                            int intrinsicWidth = drawable.getIntrinsicWidth();
                            int intrinsicHeight = drawable.getIntrinsicHeight();
                            float access$100 = ShareNewQRCodeView.access$100(ShareNewQRCodeView.this);
                            tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams((int) access$100, (int) ((access$100 / intrinsicWidth) * intrinsicHeight)));
                        }
                        tUrlImageView.setVisibility(0);
                        return true;
                    }
                });
                return;
            }
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(tUrlImageView);
            tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent != null) {
                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        float access$100 = ShareNewQRCodeView.access$100(ShareNewQRCodeView.this);
                        cVar.a(f, ShareNewQRCodeView.access$100(ShareNewQRCodeView.this));
                        int i = cVar.e;
                        int i2 = cVar.f;
                        int i3 = cVar.g;
                        int i4 = cVar.h;
                        if (i3 > access$100) {
                            i3 = (int) access$100;
                        }
                        if (i4 / access$100 > 4.0f) {
                            i4 = ((int) access$100) << 2;
                        }
                        if (i2 > access$100) {
                            i2 = 0;
                        }
                        if (i4 == 0 && i3 != 0) {
                            i4 = (int) ((intrinsicHeight / intrinsicWidth) * i3);
                        } else if (i4 != 0 && i3 == 0) {
                            i3 = (int) access$100;
                        }
                        if (i4 != 0 || i3 != 0) {
                            intrinsicWidth = i3;
                            intrinsicHeight = i4;
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) access$100, intrinsicHeight);
                        layoutParams.setMargins(i2, i, 0, 0);
                        layoutParams.height = intrinsicHeight;
                        layoutParams.width = intrinsicWidth;
                        tUrlImageView.setLayoutParams(layoutParams);
                    }
                    tUrlImageView.setVisibility(0);
                    return true;
                }
            });
        }
    }

    private void dealTextType(JSONObject jSONObject, float f, FrameLayout frameLayout, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fa959a", new Object[]{this, jSONObject, new Float(f), frameLayout, linearLayout});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("content");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            TextView textView = new TextView(this.mContext);
            c cVar = new c();
            cVar.a(jSONObject);
            cVar.a(f, getWindowWidth());
            String string2 = jSONObject.getString("color");
            int parseColor = Color.parseColor("#666666");
            try {
                if (!TextUtils.isEmpty(string2)) {
                    parseColor = Color.parseColor(string2);
                }
            } catch (Throwable unused) {
            }
            textView.setTextColor(parseColor);
            String string3 = jSONObject.getString("size");
            int i = 16;
            if (!TextUtils.isEmpty(string3)) {
                if ("small".equals(string3)) {
                    i = 12;
                } else if (com.taobao.android.weex_framework.util.a.ATOM_EXT_big.equals(string3)) {
                    i = 18;
                }
            }
            textView.setTextSize(i);
            textView.setText(string);
            if (cVar.a()) {
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout.addView(textView);
                textView.setVisibility(0);
            } else {
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                frameLayout.addView(textView);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cVar.g, cVar.h);
                layoutParams.setMargins(cVar.f, cVar.e, 0, 0);
                if (cVar.h == 0) {
                    layoutParams.height = -2;
                }
                if (cVar.g == 0) {
                    layoutParams.width = -2;
                }
                textView.setLayoutParams(layoutParams);
            }
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private void saveQRType(JSONObject jSONObject, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8419e84f", new Object[]{this, jSONObject, new Float(f)});
        } else if (jSONObject == null) {
        } else {
            c cVar = new c();
            cVar.a(jSONObject);
            cVar.a(f, getWindowWidth());
            cVar.i = f;
            ImageView imageView = new ImageView(this.mContext);
            imageView.setTag(cVar);
            if (cVar.a()) {
                imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.linearLayout.addView(imageView);
            } else {
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.frameLayout.addView(imageView);
            }
            this.qrImageViews.add(imageView);
        }
    }

    private void dealQRImages(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72bb542", new Object[]{this, bitmap});
            return;
        }
        ArrayList<ImageView> arrayList = this.qrImageViews;
        if (arrayList == null || arrayList.size() == 0 || bitmap == null) {
            return;
        }
        Iterator<ImageView> it = this.qrImageViews.iterator();
        while (it.hasNext()) {
            ImageView next = it.next();
            if (next.getTag() != null) {
                c cVar = null;
                try {
                    cVar = (c) next.getTag();
                } catch (Throwable unused) {
                }
                if (cVar != null) {
                    if (Build.VERSION.SDK_INT < 16) {
                        next.setBackgroundDrawable(new BitmapDrawable(this.mContext.getResources(), bitmap));
                    } else {
                        next.setBackground(new BitmapDrawable(this.mContext.getResources(), bitmap));
                    }
                    if (cVar.a()) {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        float windowWidth = getWindowWidth();
                        next.setLayoutParams(new LinearLayout.LayoutParams((int) windowWidth, (int) ((windowWidth / width) * height)));
                        next.setVisibility(0);
                    } else {
                        int width2 = bitmap.getWidth();
                        int height2 = bitmap.getHeight();
                        float windowWidth2 = getWindowWidth();
                        int i = cVar.e;
                        int i2 = cVar.f;
                        int i3 = cVar.g;
                        int i4 = cVar.h;
                        if (i3 > windowWidth2) {
                            i3 = (int) windowWidth2;
                        }
                        if (i4 / windowWidth2 > 4.0f) {
                            i4 = ((int) windowWidth2) << 2;
                        }
                        if (i2 > windowWidth2) {
                            i2 = 0;
                        }
                        if (i4 == 0 && i3 != 0) {
                            i4 = (int) ((height2 / width2) * i3);
                        } else if (i4 != 0 && i3 == 0) {
                            i3 = (int) ((width2 / height2) * i4);
                        }
                        if (i4 == 0 && i3 == 0) {
                            i3 = width2;
                            i4 = height2;
                        }
                        if (i4 > 0 && i3 > 0) {
                            i4 = (int) ((height2 / width2) * i3);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) windowWidth2, i4);
                        layoutParams.setMargins(i2, i, 0, 0);
                        layoutParams.height = i4;
                        layoutParams.width = i3;
                        next.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public Bitmap createQrcode(String str, String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bba68cbc", new Object[]{this, str, str2, new Integer(i)});
        }
        int a2 = obi.a(obi.b.PIIIC_QRCODE_COLOR);
        if (a2 != -1) {
            i = a2;
        }
        if (TextUtils.isEmpty(str)) {
            nyu.a(this.mContext, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_23569));
            onLoadingFinish();
            this.mGetBitmapFinish = true;
            this.mPopupWindow.dismiss();
            return null;
        }
        this.taoLongPicCode = str2;
        this.mShareUrl = str;
        this.mGetBitmapFinish = false;
        encodeQrcode(str, str2, i, new EncodeCallback() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.8
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onError(EncodeError encodeError) {
                ShareNewQRCodeView.access$500(ShareNewQRCodeView.this).post(new Runnable() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.8.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        nyu.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_23569));
                        ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                        ShareNewQRCodeView.access$402(ShareNewQRCodeView.this, true);
                        ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
                    }
                });
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onSuccess(final BitmapHolder bitmapHolder) throws RemoteException {
                TLog.logi("ShareQRCodeScanView", "generateCode get QRcode success");
                ShareNewQRCodeView.access$500(ShareNewQRCodeView.this).post(new Runnable() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.8.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BitmapHolder bitmapHolder2 = bitmapHolder;
                        if (bitmapHolder2 != null && bitmapHolder2.encodeResult != null) {
                            ShareNewQRCodeView.access$602(ShareNewQRCodeView.this, bitmapHolder.encodeResult);
                            ShareNewQRCodeView.access$700(ShareNewQRCodeView.this, i);
                            return;
                        }
                        nyu.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_23569));
                        ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                        ShareNewQRCodeView.access$402(ShareNewQRCodeView.this, true);
                        ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
                    }
                });
            }
        });
        return null;
    }

    private void mergerQrcodeBitmap(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd36ab05", new Object[]{this, new Integer(i)});
            return;
        }
        String a2 = obi.a(obi.b.PIIIC_QRCODE_URL, "");
        if (TextUtils.isEmpty(a2)) {
            doMergerBitmap(i, null);
        } else {
            com.taobao.phenix.intf.b.h().a(a2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                        Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                        float density = bitmap.getDensity() / 320.0f;
                        if (density > 0.0f) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * density), (int) (bitmap.getHeight() * density), true);
                            if (createScaledBitmap != bitmap && !bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            ShareNewQRCodeView.access$800(ShareNewQRCodeView.this, i, createScaledBitmap);
                        } else {
                            ShareNewQRCodeView.access$800(ShareNewQRCodeView.this, i, bitmap);
                        }
                    }
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    ShareNewQRCodeView.access$800(ShareNewQRCodeView.this, i, null);
                    return false;
                }
            }).fetch();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tao.longpic.ShareNewQRCodeView$3] */
    private void doMergerBitmap(final int i, final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd671c86", new Object[]{this, new Integer(i), bitmap});
        } else {
            new AsyncTask<Void, Bitmap, Bitmap>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    } else if (hashCode != 1050423957) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onProgressUpdate((Object[]) objArr[0]);
                        return null;
                    }
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [android.graphics.Bitmap, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(Bitmap bitmap2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, bitmap2});
                    } else {
                        a(bitmap2);
                    }
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onProgressUpdate(Bitmap[] bitmapArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e9c3295", new Object[]{this, bitmapArr});
                    } else {
                        a(bitmapArr);
                    }
                }

                public Bitmap a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Bitmap) ipChange2.ipc$dispatch("e1e32632", new Object[]{this, voidArr});
                    }
                    if ("qrcode".equals(ShareNewQRCodeView.access$900(ShareNewQRCodeView.this)) && ShareNewQRCodeView.access$600(ShareNewQRCodeView.this) != null) {
                        Bitmap a2 = com.taobao.share.qrcode.a.a(ShareNewQRCodeView.access$600(ShareNewQRCodeView.this), null, i);
                        publishProgress(a2);
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 == null) {
                            bitmap2 = BitmapFactory.decodeResource(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this).getResources(), R.drawable.share_qrcode_bg).copy(Bitmap.Config.ARGB_8888, true);
                        }
                        return com.taobao.share.qrcode.a.a(a2, bitmap2);
                    }
                    return ShareNewQRCodeView.access$600(ShareNewQRCodeView.this);
                }

                public void a(Bitmap... bitmapArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7853bfa1", new Object[]{this, bitmapArr});
                        return;
                    }
                    super.onProgressUpdate(bitmapArr);
                    ShareNewQRCodeView.access$1000(ShareNewQRCodeView.this, bitmapArr[0]);
                }

                public void a(Bitmap bitmap2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap2});
                        return;
                    }
                    super.onPostExecute(bitmap2);
                    if (ShareNewQRCodeView.access$1100(ShareNewQRCodeView.this) == null || ShareNewQRCodeView.access$1100(ShareNewQRCodeView.this).getVisibility() == 8) {
                        return;
                    }
                    if (bitmap2 != null) {
                        if (Build.VERSION.SDK_INT < 16) {
                            ShareNewQRCodeView.access$1100(ShareNewQRCodeView.this).setBackgroundDrawable(new BitmapDrawable(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this).getResources(), bitmap2));
                        } else {
                            ShareNewQRCodeView.access$1100(ShareNewQRCodeView.this).setBackground(new BitmapDrawable(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this).getResources(), bitmap2));
                        }
                    }
                    ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                    ShareNewQRCodeView.access$402(ShareNewQRCodeView.this, true);
                    if (ShareNewQRCodeView.access$1200(ShareNewQRCodeView.this) == null) {
                        return;
                    }
                    ShareNewQRCodeView.access$1200(ShareNewQRCodeView.this);
                }
            }.execute(new Void[0]);
        }
    }

    private void encodeQrcode(final String str, String str2, final int i, final EncodeCallback encodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d40b4c", new Object[]{this, str, str2, new Integer(i), encodeCallback});
        } else if (nym.TYPE_GEN3_CODE.equals(str2)) {
            View view = this.mQRCodeView;
            if (view == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = nyq.a(this.mContext, 130.0f);
            this.mQRCodeView.setLayoutParams(layoutParams);
            TUrlImageView tUrlImageView = this.mQRCodeLogoView;
            if (tUrlImageView != null) {
                tUrlImageView.setVisibility(0);
            }
            com.taobao.taobao.scancode.encode.aidlservice.b.a(this.mContext).a(GEN3_CODE_WHITE_BG_URL, str, 3, new MaSizeType(0, 0, nyq.a(this.mContext, 130.0f)), true, encodeCallback);
        } else {
            TUrlImageView tUrlImageView2 = this.mQRCodeLogoView;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setVisibility(8);
            }
            String i2 = obi.b.i();
            if (!TextUtils.isEmpty(i2)) {
                com.taobao.phenix.intf.b.h().a(i2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                            ShareNewQRCodeView.access$1300(ShareNewQRCodeView.this, str, i, encodeCallback, succPhenixEvent.getDrawable().getBitmap());
                        }
                        return false;
                    }
                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        ShareNewQRCodeView.access$1300(ShareNewQRCodeView.this, str, i, encodeCallback, null);
                        return false;
                    }
                }).fetch();
            } else {
                encodeQrcode(str, i, encodeCallback, (Bitmap) null);
            }
        }
    }

    private void encodeQrcode(final String str, final int i, final EncodeCallback encodeCallback, final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ab6bd8", new Object[]{this, str, new Integer(i), encodeCallback, bitmap});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        bitmap2 = BitmapFactory.decodeResource(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this).getResources(), R.drawable.share_tao_ico).copy(Bitmap.Config.ARGB_8888, true);
                    }
                    if (bitmap2 != null) {
                        com.taobao.taobao.scancode.encode.aidlservice.c.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this)).a(1, ShareUtils.bmpToByteArray(bitmap2, false), bitmap2.getWidth(), bitmap2.getHeight(), str, bitmap2.getRowBytes(), 0, nyq.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), 180.0f), 'Q', 0, encodeCallback, i);
                    } else {
                        com.taobao.taobao.scancode.encode.aidlservice.b.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this)).a(nyg.a(true), str, 0, new MaSizeType(0, 0, nyq.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), 180.0f)), false, encodeCallback);
                    }
                }
            });
        }
    }

    private void buildShareTargets(ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5307ed3", new Object[]{this, shareData});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(ShareTargetType.Share2Weixin.getValue());
        arrayList.add(ShareTargetType.Share2QQ.getValue());
        arrayList.add(ShareTargetType.Share2SinaWeibo.getValue());
        if (ShareBizAdapter.getInstance().getShareEngine() == null) {
            return;
        }
        ArrayList<com.taobao.share.globalmodel.a> a2 = ShareBizAdapter.getInstance().getShareEngine().getChanelEngine().a(arrayList, null);
        SnapshotTargetView snapshotTargetView = (SnapshotTargetView) this.mView.findViewById(R.id.snapshot_share_targets);
        if (a2 == null) {
            a2 = new ArrayList<>();
        }
        snapshotTargetView.setVisibility(0);
        snapshotTargetView.setData(this.shareListener, a2, shareData);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.tao.longpic.ShareNewQRCodeView$9] */
    private void saveToDCIMAndroid10(View view, final String str, final ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5f01c9", new Object[]{this, view, str, shareData});
            return;
        }
        final Bitmap createViewBitmap = BitmapUtil.createViewBitmap(view);
        if (createViewBitmap == null || this.isDoShareProgress) {
            return;
        }
        this.isDoShareProgress = true;
        new AsyncTask<Void, Void, Boolean>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Boolean doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, bool});
                } else {
                    a(bool);
                }
            }

            public Boolean a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Boolean) ipChange2.ipc$dispatch("8008f7d1", new Object[]{this, voidArr});
                }
                String a2 = oba.a(true, createViewBitmap, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), ShareNewQRCodeView.access$200(ShareNewQRCodeView.this));
                Bitmap bitmap = createViewBitmap;
                if (bitmap != null && !bitmap.isRecycled()) {
                    createViewBitmap.recycle();
                }
                return Boolean.valueOf(!TextUtils.isEmpty(a2));
            }

            public void a(Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                    return;
                }
                ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                if (bool.booleanValue()) {
                    if (!ShareNewQRCodeView.access$1700(ShareNewQRCodeView.this)) {
                        ShareNewQRCodeView.access$1702(ShareNewQRCodeView.this, true);
                        ShareNewQRCodeView.access$1800(ShareNewQRCodeView.this, str, shareData);
                        if (!TextUtils.isEmpty(ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this))) {
                            obc.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY, ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this));
                        }
                        TBS.Ext.commitEvent("Page_QRCode_SaveSuccess", (Properties) null);
                    }
                } else {
                    Properties properties = new Properties();
                    properties.put("Reason", "others");
                    TBS.Ext.commitEvent("Page_QRCode_SaveFail", properties);
                    Toast makeText = Toast.makeText(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17858), 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                }
                ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
            }
        }.execute(new Void[0]);
    }

    private void saveToDCIM(View view, final String str, final ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b73a31", new Object[]{this, view, str, shareData});
            return;
        }
        final Bitmap createViewBitmap = BitmapUtil.createViewBitmap(view);
        if (createViewBitmap == null || this.isDoShareProgress) {
            return;
        }
        this.isDoShareProgress = true;
        f.a(this.mContext, obl.a()).b("tb_share").a(true).a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17871)).a(new Runnable() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tao.longpic.ShareNewQRCodeView$11$1] */
            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    new AsyncTask<Void, Void, Boolean>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.11.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
                        @Override // android.os.AsyncTask
                        public /* synthetic */ Boolean doInBackground(Void[] voidArr) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                        }

                        @Override // android.os.AsyncTask
                        public /* synthetic */ void onPostExecute(Boolean bool) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b105c779", new Object[]{this, bool});
                            } else {
                                a(bool);
                            }
                        }

                        public Boolean a(Void... voidArr) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (Boolean) ipChange3.ipc$dispatch("8008f7d1", new Object[]{this, voidArr});
                            }
                            String a2 = oba.a(true, createViewBitmap, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), ShareNewQRCodeView.access$200(ShareNewQRCodeView.this));
                            if (createViewBitmap != null && !createViewBitmap.isRecycled()) {
                                createViewBitmap.recycle();
                            }
                            return Boolean.valueOf(!TextUtils.isEmpty(a2));
                        }

                        public void a(Boolean bool) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                                return;
                            }
                            ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                            if (bool.booleanValue()) {
                                if (!ShareNewQRCodeView.access$1700(ShareNewQRCodeView.this)) {
                                    ShareNewQRCodeView.access$1702(ShareNewQRCodeView.this, true);
                                    ShareNewQRCodeView.access$1800(ShareNewQRCodeView.this, str, shareData);
                                    if (!TextUtils.isEmpty(ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this))) {
                                        obc.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY, ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this));
                                    }
                                    TBS.Ext.commitEvent("Page_QRCode_SaveSuccess", (Properties) null);
                                }
                            } else {
                                Properties properties = new Properties();
                                properties.put("Reason", "others");
                                TBS.Ext.commitEvent("Page_QRCode_SaveFail", properties);
                                Toast makeText = Toast.makeText(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17858), 1);
                                makeText.setGravity(17, 0, 0);
                                makeText.show();
                            }
                            ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
                        }
                    }.execute(new Void[0]);
                }
            }
        }).b(new Runnable() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Properties properties = new Properties();
                properties.put("Reason", "noAuthorization");
                TBS.Ext.commitEvent("Page_QRCode_SaveFail", properties);
                Toast makeText = Toast.makeText(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17836), 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
            }
        }).a();
    }

    private void doShare(String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faaa8606", new Object[]{this, str, shareData});
        } else if (ShareTargetType.Share2Weixin.getValue().equals(str)) {
            showShareDialog(TPTargetType.WEIXIN, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17863), this.mContext.getResources().getColorStateList(R.color.snapshot_weixin), shareData);
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeShare", null, null, "bizID=" + shareData.getBusinessId(), "app=weixin");
        } else if (ShareTargetType.Share2QQ.getValue().equals(str)) {
            showShareDialog(TPTargetType.QQFRIEND, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17862), this.mContext.getResources().getColorStateList(R.color.snapshot_qq), shareData);
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeShare", null, null, "bizID=" + shareData.getBusinessId(), "app=qq");
        } else if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            showShareDialog(TPTargetType.SINAWEIBO, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17835), this.mContext.getResources().getColorStateList(R.color.snapshot_weibo), shareData);
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeShare", null, null, "bizID=" + shareData.getBusinessId(), "app=weibo");
        } else if (!com.taobao.umipublish.draft.b.ACTION_TYPE_SAVE.equals(str)) {
        } else {
            Toast makeText = Toast.makeText(this.mContext, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17861), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeSavePic", null, null, "bizID=" + shareData.getBusinessId());
            HashMap hashMap = new HashMap();
            hashMap.put("result", "success");
            ShareBusiness.getInstance().onShareFinished(hashMap);
            this.isShowShareDialog = false;
            sendBroadCast4Tmall();
        }
    }

    private void showShareDialog(final TPTargetType tPTargetType, String str, ColorStateList colorStateList, final ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c751aef", new Object[]{this, tPTargetType, str, colorStateList, shareData});
            return;
        }
        final PopupWindow popupWindow = new PopupWindow(this.mContext);
        View inflate = this.inflater.inflate(R.layout.share_snapshot_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.snapshot_dialog_text);
        textView.setText(str);
        textView.setTextColor(colorStateList);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (nyk.KEY_SHARE_CONFIG_SINAWEIBO.equals(tPTargetType.getInfo())) {
                    new oik().a(ShareTargetType.Share2SinaWeibo.getValue(), (Map<String, String>) null);
                    str2 = "weibo";
                } else {
                    String a2 = obc.a(tPTargetType);
                    if (!TextUtils.isEmpty(a2)) {
                        obc.d(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), a2);
                    }
                    str2 = nyk.KEY_SHARE_CONFIG_WEIXIN.equals(tPTargetType.getInfo()) ? nyk.KEY_SHARE_CONFIG_WEIXIN : "qq";
                }
                TBShareContent j = e.b().j();
                StringBuilder sb = new StringBuilder();
                sb.append("app=");
                sb.append(str2);
                sb.append("&");
                sb.append(j == null ? "" : j.originUTArgs());
                String sb2 = sb.toString();
                TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeOpenApp", null, null, "bizID=" + shareData.getBusinessId(), sb2);
                if ("qrcode".equals(ShareNewQRCodeView.access$900(ShareNewQRCodeView.this))) {
                    TBS.Ext.commitEvent("Page_QRCode_Anti", 5002, shareData.getBusinessId(), "QRCode", null, sb2);
                } else {
                    TBS.Ext.commitEvent("Page_QRCode", 5002, shareData.getBusinessId(), "QRCode", null, sb2);
                }
                popupWindow.dismiss();
                HashMap hashMap = new HashMap();
                hashMap.put("result", "success");
                ShareBusiness.getInstance().onShareFinished(hashMap);
            }
        });
        ((TIconFontTextView) inflate.findViewById(R.id.snapshot_close)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                popupWindow.dismiss();
                String str2 = tPTargetType.getInfo().equals(nyk.KEY_SHARE_CONFIG_SINAWEIBO) ? "weibo" : tPTargetType.getInfo().equals("qqfriend") ? "qq" : nyk.KEY_SHARE_CONFIG_WEIXIN;
                TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeCancelShare", null, null, "bizID=" + shareData.getBusinessId(), "app=" + str2);
            }
        });
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                ShareNewQRCodeView.access$2002(ShareNewQRCodeView.this, false);
                ShareNewQRCodeView.access$1702(ShareNewQRCodeView.this, false);
                ShareNewQRCodeView.access$2100(ShareNewQRCodeView.this);
            }
        });
        popupWindow.setContentView(inflate);
        View h = e.b().h();
        if (h == null) {
            return;
        }
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-1);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(this.mContext.getResources().getColor(R.color.half_transparent)));
        try {
            popupWindow.showAtLocation(h, 48, 0, 0);
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }

    private void initAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            return;
        }
        this.showAnimation = AnimationUtils.loadAnimation(this.mContext.getApplicationContext(), R.anim.share_push_from_down);
        this.showAnimation.setDuration(500L);
        this.showAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        });
    }

    private int getWindowWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue() : ((WindowManager) this.mContext.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }

    private void onLoadingFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707bbdd7", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        if (this.progressLayout == null) {
            this.progressLayout = view.findViewById(R.id.progressLayout);
        }
        View view2 = this.progressLayout;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    private void onLoadingStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60ade0c", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        if (this.progressLayout == null) {
            this.progressLayout = view.findViewById(R.id.progressLayout);
        }
        View view2 = this.progressLayout;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        } else {
            sendBroadCast4Tmall();
        }
    }

    private void sendBroadCast4Tmall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196fba34", new Object[]{this});
        } else if (this.isShowShareDialog) {
        } else {
            LocalBroadcastManager.getInstance(nym.a().getApplicationContext()).sendBroadcast(new Intent("action.share_dialog_close"));
        }
    }

    private SpannableStringBuilder buildPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("c6f3bfef", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("-")) {
            String[] split = str.split("\\-");
            if (split == null || split.length <= 0) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("¥" + split[0]);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(nyq.a(this.mContext, 33.0f)), 1, split[0].split("\\.")[0].length() + 1, 17);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("¥" + str);
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(nyq.a(this.mContext, 33.0f)), 1, str.split("\\.")[0].length() + 1, 17);
        return spannableStringBuilder2;
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f20739a;
        public float b;
        public float c;
        public float d;
        public int e;
        public int f;
        public int g;
        public int h;
        public float i;

        static {
            kge.a(1851655396);
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < ShareNewQRCodeView.access$2200().length; i++) {
                String str = ShareNewQRCodeView.access$2200()[i];
                try {
                    Float valueOf = Float.valueOf(Float.parseFloat(String.valueOf(jSONObject.get(str))));
                    if (valueOf != null) {
                        hashMap.put(str, valueOf);
                    } else {
                        hashMap.put(str, Float.valueOf(0.0f));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    hashMap.put(str, Float.valueOf(0.0f));
                }
            }
            this.f20739a = ((Float) hashMap.get(ShareNewQRCodeView.access$2300())).floatValue();
            this.b = ((Float) hashMap.get(ShareNewQRCodeView.access$2400())).floatValue();
            this.c = ((Float) hashMap.get(ShareNewQRCodeView.access$2500())).floatValue();
            this.d = ((Float) hashMap.get(ShareNewQRCodeView.access$2600())).floatValue();
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            float f3 = f2 / f;
            this.e = (int) (this.f20739a * f3);
            this.f = (int) (this.b * f3);
            this.g = (int) (this.c * f3);
            this.h = (int) (f3 * this.d);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f20739a == 0.0f && this.b == 0.0f && this.c == 0.0f && this.d == 0.0f;
        }
    }

    private void loadImage(Context context, String str, Boolean bool, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90540891", new Object[]{this, context, str, bool, imageView});
        } else if (context == null || TextUtils.isEmpty(str) || imageView == null) {
        } else {
            if (bool.booleanValue()) {
                com.taobao.phenix.intf.b.h().a(context).a(str).bitmapProcessors(new com.taobao.phenix.compat.effects.c()).into(imageView);
            } else {
                com.taobao.phenix.intf.b.h().a(context).a(str).into(imageView);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends RecyclerView.Adapter<C0868b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LayoutInflater f20735a;
        private List<com.taobao.share.globalmodel.a> b;
        private Context c;
        private a d;

        /* loaded from: classes8.dex */
        public interface a {
            void a(com.taobao.share.globalmodel.a aVar);
        }

        /* renamed from: com.taobao.tao.longpic.ShareNewQRCodeView$b$b  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static class C0868b extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public TIconFontTextView f20738a;
            public ImageView b;
            public TextView c;
            public ImageView d;
            public TextView e;

            static {
                kge.a(795215833);
            }

            public C0868b(View view) {
                super(view);
            }
        }

        static {
            kge.a(-440393060);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ a a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("55aa51c7", new Object[]{bVar}) : bVar.d;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(C0868b c0868b, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, c0868b, new Integer(i)});
            } else {
                a(c0868b, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.tao.longpic.ShareNewQRCodeView$b$b, android.support.v7.widget.RecyclerView$ViewHolder] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ C0868b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public b(Context context, List<com.taobao.share.globalmodel.a> list) {
            this.c = context.getApplicationContext();
            this.f20735a = LayoutInflater.from(this.c);
            this.b = list;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("657055e9", new Object[]{this, aVar});
            } else {
                this.d = aVar;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            List<com.taobao.share.globalmodel.a> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public C0868b a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0868b) ipChange.ipc$dispatch("6ef8e35c", new Object[]{this, viewGroup, new Integer(i)});
            }
            View inflate = this.f20735a.inflate(R.layout.share_item, viewGroup, false);
            C0868b c0868b = new C0868b(inflate);
            c0868b.c = (TextView) inflate.findViewById(R.id.target_item_title);
            c0868b.b = (ImageView) inflate.findViewById(R.id.target_item_image);
            c0868b.f20738a = (TIconFontTextView) inflate.findViewById(R.id.target_item_iconfont);
            c0868b.d = (ImageView) inflate.findViewById(R.id.target_item_mask);
            c0868b.e = (TextView) inflate.findViewById(R.id.target_item_mark_tv);
            return c0868b;
        }

        public void a(C0868b c0868b, int i) {
            IpChange ipChange = $ipChange;
            int i2 = 2;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48a8f1bb", new Object[]{this, c0868b, new Integer(i)});
                return;
            }
            final com.taobao.share.globalmodel.a aVar = this.b.get(i);
            try {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) c0868b.itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.setMarginStart(i == 0 ? nyq.a(this.c, 5.0f) : 0);
                }
                c0868b.itemView.setLayoutParams(layoutParams);
            } catch (Throwable unused) {
            }
            c0868b.c.setText(aVar.d());
            if (aVar.e() == -1 && aVar.f() > 0) {
                c0868b.b.setVisibility(0);
                c0868b.f20738a.setVisibility(8);
                c0868b.b.setImageResource(aVar.f());
            } else if (aVar.e() > 0 && aVar.f() == -1) {
                c0868b.b.setVisibility(8);
                c0868b.f20738a.setVisibility(0);
                c0868b.f20738a.setText(this.c.getResources().getString(aVar.e()));
            }
            if (a(aVar.c())) {
                c0868b.d.setVisibility(0);
            } else {
                c0868b.d.setVisibility(8);
            }
            if (TextUtils.isEmpty(aVar.g())) {
                c0868b.e.setVisibility(8);
            } else {
                c0868b.e.setVisibility(0);
                String g = aVar.g();
                if (g.length() <= 2) {
                    i2 = g.length();
                }
                c0868b.e.setText(g.substring(0, i2));
            }
            if (this.d == null) {
                return;
            }
            c0868b.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        b.a(b.this).a(aVar);
                    }
                }
            });
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.taobao.tao.longpic.ShareNewQRCodeView$b$2] */
        private boolean a(String str) {
            final SharedPreferences defaultSharedPreferences;
            final int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            if (!ShareTargetType.Share2QRCode.getValue().equals(str) || (i = (defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c)).getInt("show_share_qrcode_mask_count", 0)) >= 3) {
                return false;
            }
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putInt("show_share_qrcode_mask_count", i + 1);
                    edit.apply();
                    return null;
                }
            }.execute(new Void[0]);
            return true;
        }
    }
}
