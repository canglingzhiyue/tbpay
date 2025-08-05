package com.alipay.android.msp.drivers.stores.store.events;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.callback.ImageUploadCallback;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.utils.BitmapUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.taobao.taobao.R;
import com.taobao.umipublish.draft.b;
import java.util.ArrayList;
import tb.cjn;

/* loaded from: classes3.dex */
public class SnapShotStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String[] g;
    private MspBaseActivity h;
    private boolean i;
    private boolean j;
    private String k;

    public static /* synthetic */ Object ipc$super(SnapShotStore snapShotStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(SnapShotStore snapShotStore, boolean z, EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d8c4c0", new Object[]{snapShotStore, new Boolean(z), eventAction});
        } else {
            snapShotStore.a(z, eventAction);
        }
    }

    public static /* synthetic */ String[] a(SnapShotStore snapShotStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("264bcad4", new Object[]{snapShotStore}) : snapShotStore.g;
    }

    public static /* synthetic */ MspBaseActivity b(SnapShotStore snapShotStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspBaseActivity) ipChange.ipc$dispatch("f2d47cad", new Object[]{snapShotStore}) : snapShotStore.h;
    }

    public static /* synthetic */ void b(SnapShotStore snapShotStore, EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b9a1d", new Object[]{snapShotStore, eventAction, new Boolean(z)});
        } else {
            snapShotStore.b(eventAction, z);
        }
    }

    public SnapShotStore(int i) {
        super(i);
        this.g = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        this.j = true;
        this.i = false;
        this.k = "";
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter mspBasePresenter;
        final boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || (mspBasePresenter = this.f4584a.getMspBasePresenter()) == null || mspBasePresenter.mo545getIView() == null) {
            return null;
        }
        try {
            this.h = (MspBaseActivity) mspBasePresenter.mo545getIView();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (this.h == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        this.k = "";
        this.i = false;
        this.j = true;
        if (actionParamsJson != null) {
            try {
                z = !TextUtils.equals(actionParamsJson.getString(cjn.HUMMER_FOUNDATION_SHOW_ALERT), "false");
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
                if (this.f4584a != null && actionParamsJson != null) {
                    this.f4584a.getStatisticInfo().addError(ErrorType.DEFAULT, "json_error", "params: ".concat(String.valueOf(actionParamsJson)));
                }
                return "";
            }
        } else {
            z = true;
        }
        if (actionParamsJson != null && actionParamsJson.containsKey(b.ACTION_TYPE_SAVE)) {
            this.j = actionParamsJson.getBooleanValue(b.ACTION_TYPE_SAVE);
        }
        if (actionParamsJson != null && actionParamsJson.containsKey("upload")) {
            this.i = actionParamsJson.getBoolean("upload").booleanValue();
        }
        if (actionParamsJson != null && actionParamsJson.containsKey("selector")) {
            this.k = actionParamsJson.getString("selector");
        }
        if (!this.h.shouldShowRequestPermissionRationale(this.g[0]) || !this.j) {
            z2 = false;
        }
        if (!z2) {
            if (this.h.hasSelfPermission(this.g[0]) || !this.j || Build.VERSION.SDK_INT >= 29) {
                a(z, eventAction);
                return InvokeActionPlugin.AYSNC_CALLBACK;
            }
            this.h.requestPermissions(this.g, new MspBaseActivity.ResultCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.views.MspBaseActivity.ResultCallback
                public void onResult(Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4d1d691", new Object[]{this, bundle});
                    } else if (bundle.getBoolean(SnapShotStore.a(SnapShotStore.this)[0], false)) {
                        SnapShotStore.a(SnapShotStore.this, z, eventAction);
                    } else {
                        SnapShotStore.a(SnapShotStore.this, eventAction, z);
                    }
                }
            });
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new FlybirdDialogEventDesc(SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_btn_ok), null));
                    SnapShotStore.b(SnapShotStore.this).showCustomOptDialog(null, SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_snapshot_permission_deny), arrayList);
                } catch (Throwable th3) {
                    LogUtil.printExceptionStackTrace(th3);
                }
            }
        });
        return "";
    }

    private void a(EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6288087b", new Object[]{this, eventAction, new Boolean(z)});
            return;
        }
        try {
            View decorView = this.h.getWindow().getDecorView();
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(0.0f, -rect.top);
            decorView.draw(canvas);
            if (createBitmap == null) {
                b(eventAction, z);
            } else {
                a(eventAction, createBitmap, z);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private void a(boolean z, final EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107e867d", new Object[]{this, new Boolean(z), eventAction});
        } else if (this.h.isFinishing()) {
        } else {
            if (TextUtils.isEmpty(this.k)) {
                a(eventAction, z);
            } else {
                a(z, eventAction, new ImageUploadCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.core.callback.ImageUploadCallback
                    public void onError(Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b14ba516", new Object[]{this, exc});
                        }
                    }

                    @Override // com.alipay.android.msp.core.callback.ImageUploadCallback
                    public void onSuccess(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cloudId", (Object) str);
                        Utils.sendToDocument(eventAction, jSONObject.toJSONString());
                    }
                });
            }
        }
    }

    private void a(boolean z, EventAction eventAction, ImageUploadCallback imageUploadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3ef141", new Object[]{this, new Boolean(z), eventAction, imageUploadCallback});
            return;
        }
        FBDocument invokeDoc = eventAction.getInvokeDoc();
        if (invokeDoc == null) {
            return;
        }
        try {
            Bitmap viewBitmap = Utils.getViewBitmap(invokeDoc.queryView(this.k));
            if (viewBitmap == null) {
                return;
            }
            if (this.j) {
                a(eventAction, viewBitmap, z);
            }
            if (!this.i) {
                return;
            }
            PhoneCashierMspEngine.getMspWallet().uploadBitmap(viewBitmap, "portal_xvk2np", imageUploadCallback);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private void b(EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef751f9a", new Object[]{this, eventAction, new Boolean(z)});
            return;
        }
        c(eventAction, false);
        if (!z) {
            return;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new MspDialogButton(SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_btn_ok), new EventAction("dismiss")));
                    SnapShotStore.b(SnapShotStore.this).showDialogView(null, SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_snapshot_failed), arrayList);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        });
    }

    private static void c(EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6236b9", new Object[]{eventAction, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", (Object) (z ? "1" : "0"));
        Utils.sendToDocument(eventAction, jSONObject.toJSONString());
    }

    private Bitmap a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("99351448", new Object[]{this, view});
        }
        Bitmap bitmap = null;
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        int drawingCacheQuality = view.getDrawingCacheQuality();
        try {
            view.setDrawingCacheEnabled(true);
            view.setDrawingCacheQuality(1048576);
            bitmap = view.getDrawingCache();
        } finally {
            try {
                return bitmap;
            } finally {
            }
        }
        return bitmap;
    }

    private void a(final EventAction eventAction, final Bitmap bitmap, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a9629f", new Object[]{this, eventAction, bitmap, new Boolean(z)});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String a2 = SnapShotStore.a(SnapShotStore.this, bitmap);
                    if (TextUtils.isEmpty(a2)) {
                        SnapShotStore.b(SnapShotStore.this, eventAction, z);
                    } else {
                        SnapShotStore.a(SnapShotStore.this, eventAction, a2, z);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(SnapShotStore snapShotStore, EventAction eventAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae246be", new Object[]{snapShotStore, eventAction, new Boolean(z)});
            return;
        }
        c(eventAction, false);
        if (!z) {
            return;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new MspDialogButton(SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_btn_ok), new EventAction("dismiss")));
                    SnapShotStore.b(SnapShotStore.this).showDialogView(null, SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_snapshot_no_permission), arrayList);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        });
    }

    public static /* synthetic */ String a(SnapShotStore snapShotStore, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a74e3437", new Object[]{snapShotStore, bitmap});
        }
        String saveBitmap = BitmapUtil.saveBitmap(snapShotStore.d, bitmap, "snapshot_".concat(String.valueOf((System.currentTimeMillis() / 1000) + ".jpg")));
        if (saveBitmap == null && snapShotStore.f4584a != null) {
            snapShotStore.f4584a.getStatisticInfo().addError(ErrorType.DEFAULT, "save_image_failed", "saveSnapshotBitmap");
        }
        return saveBitmap;
    }

    public static /* synthetic */ void a(SnapShotStore snapShotStore, EventAction eventAction, final String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe60efb4", new Object[]{snapShotStore, eventAction, str, new Boolean(z)});
            return;
        }
        c(eventAction, true);
        if (!z) {
            return;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SnapShotStore.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new MspDialogButton(SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_btn_ok), new EventAction("dismiss")));
                    SnapShotStore.b(SnapShotStore.this).showDialogView(null, String.format(SnapShotStore.b(SnapShotStore.this).getString(R.string.msp_snapshot_success), str), arrayList);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        });
    }
}
