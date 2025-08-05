package com.taobao.android.a11y.ability.ocr;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.eta;
import tb.kge;

/* loaded from: classes4.dex */
public class OCRBatchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile OCRBatchManager f8606a;
    private b e;
    private final a c = new a();
    private final Map<String, WeakReference<View>> b = new HashMap();
    private BatchStatus d = BatchStatus.BATCH_FIRST_REQUEST;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum BatchStatus {
        BATCH_FIRST_REQUEST,
        BATCH_WAITING,
        BATCH_READY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface b {
        void a(HashMap<String, View> hashMap);
    }

    static {
        kge.a(1604816759);
    }

    public static /* synthetic */ void a(OCRBatchManager oCRBatchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826af02", new Object[]{oCRBatchManager});
        } else {
            oCRBatchManager.d();
        }
    }

    public static /* synthetic */ Map b(OCRBatchManager oCRBatchManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("76fc0a96", new Object[]{oCRBatchManager}) : oCRBatchManager.b;
    }

    public static /* synthetic */ b c(OCRBatchManager oCRBatchManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9393d51c", new Object[]{oCRBatchManager}) : oCRBatchManager.e;
    }

    private OCRBatchManager() {
    }

    public static OCRBatchManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OCRBatchManager) ipChange.ipc$dispatch("9b25f902", new Object[0]);
        }
        if (f8606a == null) {
            synchronized (OCRBatchManager.class) {
                if (f8606a == null) {
                    f8606a = new OCRBatchManager();
                }
            }
        }
        return f8606a;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980c6304", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }

    public void a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
            return;
        }
        this.b.put(str, new WeakReference<>(view));
        if (this.d != BatchStatus.BATCH_FIRST_REQUEST) {
            return;
        }
        long c = eta.c();
        a aVar = this.c;
        int ordinal = BatchStatus.BATCH_READY.ordinal();
        if (c <= 0) {
            c = 1000;
        }
        aVar.sendEmptyMessageDelayed(ordinal, c);
        this.d = BatchStatus.BATCH_WAITING;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.clear();
        this.d = BatchStatus.BATCH_FIRST_REQUEST;
    }

    /* loaded from: classes4.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(571419357);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what != BatchStatus.BATCH_READY.ordinal()) {
                return;
            }
            HashMap<String, View> hashMap = new HashMap<>();
            for (Map.Entry entry : OCRBatchManager.b(OCRBatchManager.this).entrySet()) {
                String str = (String) entry.getKey();
                WeakReference weakReference = (WeakReference) entry.getValue();
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    hashMap.put(str, view);
                }
            }
            if (OCRBatchManager.c(OCRBatchManager.this) != null) {
                OCRBatchManager.c(OCRBatchManager.this).a(hashMap);
            }
            OCRBatchManager.a(OCRBatchManager.this);
        }
    }
}
