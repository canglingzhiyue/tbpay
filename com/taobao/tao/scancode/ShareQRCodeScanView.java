package com.taobao.tao.scancode;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.e;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.taobao.taobao.scancode.encode.aidlservice.c;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.data.ShareData;
import com.ut.share.utils.ShareUtils;
import java.util.List;
import tb.kge;
import tb.nyg;
import tb.nym;
import tb.nyq;
import tb.nyr;
import tb.nyu;
import tb.obi;

/* loaded from: classes8.dex */
public class ShareQRCodeScanView implements PopupWindow.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_SHARE_DIALOG_CLOSE = "action.share_dialog_close";
    private Animation dismissAnimation;
    private LayoutInflater inflater;
    private a listener;
    private Context mContext;
    private boolean mGetBitmapFinish = false;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private PopupWindow mPopupWindow;
    private Bitmap mQRBitmap;
    private View mQRCodeView;
    private View mView;
    private View progressLayout;
    private Animation showAnimation;

    /* loaded from: classes8.dex */
    public interface a {
    }

    static {
        kge.a(2065499114);
        kge.a(-776969364);
    }

    public static /* synthetic */ PopupWindow access$000(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("7331f0b4", new Object[]{shareQRCodeScanView}) : shareQRCodeScanView.mPopupWindow;
    }

    public static /* synthetic */ int access$100(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6749ce52", new Object[]{shareQRCodeScanView})).intValue() : shareQRCodeScanView.getWindowWidth();
    }

    public static /* synthetic */ View access$1000(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c5bf533", new Object[]{shareQRCodeScanView}) : shareQRCodeScanView.mQRCodeView;
    }

    public static /* synthetic */ a access$1100(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c6a655fa", new Object[]{shareQRCodeScanView}) : shareQRCodeScanView.listener;
    }

    public static /* synthetic */ Context access$200(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6a4fedb6", new Object[]{shareQRCodeScanView}) : shareQRCodeScanView.mContext;
    }

    public static /* synthetic */ void access$300(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fb031d", new Object[]{shareQRCodeScanView});
        } else {
            shareQRCodeScanView.onLoadingFinish();
        }
    }

    public static /* synthetic */ boolean access$402(ShareQRCodeScanView shareQRCodeScanView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b7005e", new Object[]{shareQRCodeScanView, new Boolean(z)})).booleanValue();
        }
        shareQRCodeScanView.mGetBitmapFinish = z;
        return z;
    }

    public static /* synthetic */ Handler access$500(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1b287b0b", new Object[]{shareQRCodeScanView}) : shareQRCodeScanView.mHandler;
    }

    public static /* synthetic */ Bitmap access$600(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("b98c9318", new Object[]{shareQRCodeScanView}) : shareQRCodeScanView.mQRBitmap;
    }

    public static /* synthetic */ Bitmap access$602(ShareQRCodeScanView shareQRCodeScanView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ee3bf94", new Object[]{shareQRCodeScanView, bitmap});
        }
        shareQRCodeScanView.mQRBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$700(ShareQRCodeScanView shareQRCodeScanView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d150998a", new Object[]{shareQRCodeScanView, new Integer(i)});
        } else {
            shareQRCodeScanView.mergerQrcodeBitmap(i);
        }
    }

    public static /* synthetic */ void access$800(ShareQRCodeScanView shareQRCodeScanView, String str, int i, EncodeCallback encodeCallback, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c57ac5", new Object[]{shareQRCodeScanView, str, new Integer(i), encodeCallback, bitmap});
        } else {
            shareQRCodeScanView.encodeQrcode(str, i, encodeCallback, bitmap);
        }
    }

    public static /* synthetic */ void access$900(ShareQRCodeScanView shareQRCodeScanView, int i, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd91322", new Object[]{shareQRCodeScanView, new Integer(i), bitmap});
        } else {
            shareQRCodeScanView.doMergerBitmap(i, bitmap);
        }
    }

    public ShareQRCodeScanView(Context context) {
        this.mContext = context;
    }

    public void showSnapshotDialog(List<String> list, final ShareData shareData, String str, JSONObject jSONObject, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32479da2", new Object[]{this, list, shareData, str, jSONObject, new Boolean(z), aVar});
            return;
        }
        this.listener = aVar;
        if (this.mPopupWindow != null) {
            return;
        }
        TBS.Ext.commitEvent("Page_QRCode_Scan", 19999, "ShowPicView", null, null, "bizID=" + shareData.getBusinessId());
        initAnimation();
        this.inflater = LayoutInflater.from(nym.a().getApplicationContext());
        this.mView = this.inflater.inflate(R.layout.share_qrcode_scan_view, (ViewGroup) null);
        View h = e.b().h();
        if (h == null) {
            return;
        }
        this.mQRCodeView = this.mView.findViewById(R.id.snapshot_qrcode);
        View findViewById = this.mView.findViewById(R.id.super_user_container);
        if (z) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        String sourceType = shareData.getSourceType();
        String text = shareData.getText();
        if (!StringUtils.isEmpty(text)) {
            if ("shop".equals(sourceType)) {
                TextView textView = (TextView) this.mView.findViewById(R.id.snapshot_title_shop);
                textView.setText(text);
                textView.setVisibility(0);
            } else {
                TextView textView2 = (TextView) this.mView.findViewById(R.id.snapshot_title);
                textView2.setText(text);
                textView2.setVisibility(0);
            }
        }
        initImage(shareData.getImageUrl());
        initBottomView();
        this.mPopupWindow = new PopupWindow(this.mContext);
        this.mPopupWindow.setContentView(this.mView);
        this.mPopupWindow.setWidth(-1);
        this.mPopupWindow.setHeight(-1);
        this.mPopupWindow.setFocusable(true);
        this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(this.mContext.getResources().getColor(R.color.half_transparent)));
        ((TIconFontTextView) this.mView.findViewById(R.id.snapshot_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBS.Ext.commitEvent("Page_QRCode_Scan", 19999, "QRCodeScanCancel", null, null, "bizID=" + shareData.getBusinessId());
                ShareQRCodeScanView.access$000(ShareQRCodeScanView.this).dismiss();
            }
        });
        this.mPopupWindow.setOnDismissListener(this);
        try {
            this.mPopupWindow.showAtLocation(h, 81, 0, 0);
        } catch (WindowManager.BadTokenException unused) {
        }
        onLoadingStart();
    }

    private void initBottomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773b9d27", new Object[]{this});
            return;
        }
        String j = obi.b.j();
        if (StringUtils.isEmpty(j)) {
            this.mView.findViewById(R.id.share_bottom_layout).setVisibility(0);
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.share_bottom_iv);
        tUrlImageView.setImageUrl(j);
        tUrlImageView.setVisibility(0);
    }

    private void initImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a728767c", new Object[]{this, str});
            return;
        }
        final TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.snapshot_image);
        tUrlImageView.setVisibility(0);
        tUrlImageView.setImageUrl(str);
        tUrlImageView.setStrategyConfig(nyr.f31846a);
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tUrlImageView.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.5
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
        tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.6
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
                    float access$100 = ShareQRCodeScanView.access$100(ShareQRCodeScanView.this);
                    tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams((int) access$100, (int) ((access$100 / intrinsicWidth) * intrinsicHeight)));
                }
                tUrlImageView.setVisibility(0);
                return true;
            }
        });
    }

    public Bitmap createQrcode(String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dc8a3e86", new Object[]{this, str, new Integer(i)});
        }
        if (this.mPopupWindow == null) {
            return null;
        }
        int a2 = obi.a(obi.b.PIIIC_QRCODE_COLOR);
        if (a2 != -1) {
            i = a2;
        }
        if (StringUtils.isEmpty(str)) {
            nyu.a(this.mContext, b.a(R.string.taobao_app_1010_1_23569));
            onLoadingFinish();
            this.mGetBitmapFinish = true;
            this.mPopupWindow.dismiss();
            return null;
        }
        this.mGetBitmapFinish = false;
        encodeQrcode(str, i, new EncodeCallback() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.4
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onError(EncodeError encodeError) throws RemoteException {
                ShareQRCodeScanView.access$500(ShareQRCodeScanView.this).post(new Runnable() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        nyu.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), b.a(R.string.taobao_app_1010_1_23569));
                        ShareQRCodeScanView.access$300(ShareQRCodeScanView.this);
                        ShareQRCodeScanView.access$402(ShareQRCodeScanView.this, true);
                        ShareQRCodeScanView.access$000(ShareQRCodeScanView.this).dismiss();
                    }
                });
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onSuccess(final BitmapHolder bitmapHolder) throws RemoteException {
                TLog.logi("ShareQRCodeScanView", "generateCode get QRcode success");
                ShareQRCodeScanView.access$500(ShareQRCodeScanView.this).post(new Runnable() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.4.2
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
                            ShareQRCodeScanView.access$602(ShareQRCodeScanView.this, bitmapHolder.encodeResult);
                            ShareQRCodeScanView.access$700(ShareQRCodeScanView.this, i);
                            return;
                        }
                        nyu.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), b.a(R.string.taobao_app_1010_1_23569));
                        ShareQRCodeScanView.access$300(ShareQRCodeScanView.this);
                        ShareQRCodeScanView.access$402(ShareQRCodeScanView.this, true);
                        ShareQRCodeScanView.access$000(ShareQRCodeScanView.this).dismiss();
                    }
                });
            }
        });
        return null;
    }

    private void encodeQrcode(final String str, final int i, final EncodeCallback encodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11433316", new Object[]{this, str, new Integer(i), encodeCallback});
            return;
        }
        String i2 = obi.b.i();
        if (!StringUtils.isEmpty(i2)) {
            com.taobao.phenix.intf.b.h().a(i2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.8
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
                        ShareQRCodeScanView.access$800(ShareQRCodeScanView.this, str, i, encodeCallback, succPhenixEvent.getDrawable().getBitmap());
                    }
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.7
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
                    ShareQRCodeScanView.access$800(ShareQRCodeScanView.this, str, i, encodeCallback, null);
                    return false;
                }
            }).fetch();
        } else {
            encodeQrcode(str, i, encodeCallback, null);
        }
    }

    private void mergerQrcodeBitmap(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd36ab05", new Object[]{this, new Integer(i)});
            return;
        }
        String a2 = obi.a(obi.b.PIIIC_QRCODE_URL, "");
        if (StringUtils.isEmpty(a2)) {
            doMergerBitmap(i, null);
        } else {
            com.taobao.phenix.intf.b.h().a(a2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.10
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
                            ShareQRCodeScanView.access$900(ShareQRCodeScanView.this, i, createScaledBitmap);
                        } else {
                            ShareQRCodeScanView.access$900(ShareQRCodeScanView.this, i, bitmap);
                        }
                    }
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.9
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
                    ShareQRCodeScanView.access$900(ShareQRCodeScanView.this, i, null);
                    return false;
                }
            }).fetch();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tao.scancode.ShareQRCodeScanView$11] */
    private void doMergerBitmap(final int i, final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd671c86", new Object[]{this, new Integer(i), bitmap});
        } else {
            new AsyncTask<Void, Bitmap, Bitmap>() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass11 anonymousClass11, String str, Object... objArr) {
                    if (str.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

                public Bitmap a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Bitmap) ipChange2.ipc$dispatch("e1e32632", new Object[]{this, voidArr});
                    }
                    if (ShareQRCodeScanView.access$600(ShareQRCodeScanView.this) == null) {
                        return null;
                    }
                    Bitmap a2 = com.taobao.share.qrcode.a.a(ShareQRCodeScanView.access$600(ShareQRCodeScanView.this), null, i);
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        bitmap2 = BitmapFactory.decodeResource(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this).getResources(), R.drawable.share_qrcode_bg).copy(Bitmap.Config.ARGB_8888, true);
                    }
                    return com.taobao.share.qrcode.a.a(a2, bitmap2);
                }

                public void a(Bitmap bitmap2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap2});
                        return;
                    }
                    super.onPostExecute(bitmap2);
                    if (ShareQRCodeScanView.access$1000(ShareQRCodeScanView.this) == null) {
                        return;
                    }
                    if (bitmap2 != null) {
                        if (Build.VERSION.SDK_INT < 16) {
                            ShareQRCodeScanView.access$1000(ShareQRCodeScanView.this).setBackgroundDrawable(new BitmapDrawable(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this).getResources(), bitmap2));
                        } else {
                            ShareQRCodeScanView.access$1000(ShareQRCodeScanView.this).setBackground(new BitmapDrawable(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this).getResources(), bitmap2));
                        }
                    }
                    ShareQRCodeScanView.access$300(ShareQRCodeScanView.this);
                    ShareQRCodeScanView.access$402(ShareQRCodeScanView.this, true);
                    if (ShareQRCodeScanView.access$1100(ShareQRCodeScanView.this) == null) {
                        return;
                    }
                    ShareQRCodeScanView.access$1100(ShareQRCodeScanView.this);
                }
            }.execute(new Void[0]);
        }
    }

    private void encodeQrcode(final String str, final int i, final EncodeCallback encodeCallback, final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ab6bd8", new Object[]{this, str, new Integer(i), encodeCallback, bitmap});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.2
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
                        bitmap2 = BitmapFactory.decodeResource(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this).getResources(), R.drawable.share_tao_ico).copy(Bitmap.Config.ARGB_8888, true);
                    }
                    if (bitmap2 != null) {
                        c.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this)).a(1, ShareUtils.bmpToByteArray(bitmap2, false), bitmap2.getWidth(), bitmap2.getHeight(), str, bitmap2.getRowBytes(), 0, nyq.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), 180.0f), 'Q', 0, encodeCallback, i);
                    } else {
                        com.taobao.taobao.scancode.encode.aidlservice.b.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this)).a(nyg.a(true), str, 0, new MaSizeType(0, 0, nyq.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), 180.0f)), false, encodeCallback);
                    }
                }
            });
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
        this.showAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.3
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
            return;
        }
        LocalBroadcastManager.getInstance(nym.a().getApplicationContext()).sendBroadcast(new Intent("action.share_dialog_close"));
        this.mHandler.removeCallbacksAndMessages(null);
    }
}
