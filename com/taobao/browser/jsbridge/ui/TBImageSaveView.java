package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.taobao.windvane.runtimepermission.b;
import android.taobao.windvane.util.h;
import android.taobao.windvane.util.m;
import android.taobao.windvane.view.a;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class TBImageSaveView implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TBImageSaveView mPopupController;
    private a mPopupView;
    private String[] mPopupMenuTags = {ILocalizationService.SAVE_TO_ALBUM};
    private String mImageUrl = null;
    private Context context = null;
    private Handler mHandler = null;
    private View.OnClickListener popupClickListener = new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.TBImageSaveView.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TBImageSaveView.access$000(TBImageSaveView.this) == null || TBImageSaveView.access$100(TBImageSaveView.this) == null || TBImageSaveView.access$200(TBImageSaveView.this) == null) {
                m.e("TBImageSaveView", "save image param error");
            } else {
                if (TBImageSaveView.access$300(TBImageSaveView.this) != null && TBImageSaveView.access$300(TBImageSaveView.this).length > 0 && TBImageSaveView.access$300(TBImageSaveView.this)[0].equals(view.getTag())) {
                    try {
                        b.a(TBImageSaveView.access$200(TBImageSaveView.this), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: com.taobao.browser.jsbridge.ui.TBImageSaveView.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    h.a(TBImageSaveView.access$200(TBImageSaveView.this).getApplicationContext(), TBImageSaveView.access$100(TBImageSaveView.this), TBImageSaveView.access$000(TBImageSaveView.this));
                                }
                            }
                        }).b(new Runnable() { // from class: com.taobao.browser.jsbridge.ui.TBImageSaveView.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    TBImageSaveView.access$000(TBImageSaveView.this).sendEmptyMessage(405);
                                }
                            }
                        }).b();
                    } catch (Exception unused) {
                    }
                }
                TBImageSaveView.access$400(TBImageSaveView.this).b();
            }
        }
    };

    static {
        kge.a(1432447127);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Handler access$000(TBImageSaveView tBImageSaveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("504c9437", new Object[]{tBImageSaveView}) : tBImageSaveView.mHandler;
    }

    public static /* synthetic */ String access$100(TBImageSaveView tBImageSaveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a2a3730", new Object[]{tBImageSaveView}) : tBImageSaveView.mImageUrl;
    }

    public static /* synthetic */ Context access$200(TBImageSaveView tBImageSaveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("947ffca9", new Object[]{tBImageSaveView}) : tBImageSaveView.context;
    }

    public static /* synthetic */ String[] access$300(TBImageSaveView tBImageSaveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("21bfb141", new Object[]{tBImageSaveView}) : tBImageSaveView.mPopupMenuTags;
    }

    public static /* synthetic */ a access$400(TBImageSaveView tBImageSaveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6d17e717", new Object[]{tBImageSaveView}) : tBImageSaveView.mPopupView;
    }

    public static TBImageSaveView getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBImageSaveView) ipChange.ipc$dispatch("957f407c", new Object[0]);
        }
        if (mPopupController == null) {
            synchronized (TBImageSaveView.class) {
                if (mPopupController == null) {
                    mPopupController = new TBImageSaveView();
                }
            }
        }
        return mPopupController;
    }

    public void save(String str, Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85b1b58", new Object[]{this, str, context, view});
            return;
        }
        this.context = context;
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        this.mImageUrl = str;
        this.mPopupView = new a(this.context, view, this.mPopupMenuTags, this.popupClickListener);
        this.mPopupView.a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 404) {
            try {
                Toast.makeText(this.context, ILocalizationService.IMAGE_SAVED_SUCCESS, 1).show();
            } catch (Exception e) {
                m.e("TBImageSaveView", "NOTIFY_SAVE_IMAGE_SUCCESS fail " + e.getMessage());
            }
            return true;
        } else if (i != 405) {
            return false;
        } else {
            try {
                Toast.makeText(this.context, ILocalizationService.IMAGE_SAVED_FAIL, 1).show();
            } catch (Exception e2) {
                m.e("TBImageSaveView", "NOTIFY_SAVE_IMAGE_FAIL fail " + e2.getMessage());
            }
            return true;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        a aVar = this.mPopupView;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }
}
