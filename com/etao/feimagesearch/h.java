package com.etao.feimagesearch;

import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.imagesearch.component.preview.PreviewManager;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6674a;
    private long b;
    private Uri c;
    private boolean d;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final h f6676a;

        static {
            kge.a(539698242);
            f6676a = new h();
        }

        public static /* synthetic */ h a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("be604424", new Object[0]) : f6676a;
        }
    }

    static {
        kge.a(556163822);
    }

    public static /* synthetic */ long a(h hVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3441375a", new Object[]{hVar, new Long(j)})).longValue();
        }
        hVar.b = j;
        return j;
    }

    public static /* synthetic */ Uri a(h hVar, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("783fa920", new Object[]{hVar, uri});
        }
        hVar.c = uri;
        return uri;
    }

    public static /* synthetic */ boolean a(h hVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("246d816c", new Object[]{hVar, str})).booleanValue() : hVar.a(str);
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3441737a", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.f6674a = z;
        return z;
    }

    private h() {
        this.d = false;
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("be604424", new Object[0]) : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.d || b.af()) {
        } else {
            if (!(context instanceof Application)) {
                throw new RuntimeException("context should be application");
            }
            this.d = true;
            context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.etao.feimagesearch.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 1546015465) {
                        super.onChange(((Boolean) objArr[0]).booleanValue(), (Uri) objArr[1]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z, Uri uri) {
                    List<String> pathSegments;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
                        return;
                    }
                    super.onChange(z, uri);
                    if (uri == null || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() <= 0 || !h.a(h.this, pathSegments.get(0))) {
                        h.a(h.this, (Uri) null);
                    } else {
                        h.a(h.this, uri);
                    }
                    h.a(h.this, System.currentTimeMillis());
                    h.a(h.this, true);
                }
            });
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f6674a && (System.currentTimeMillis() - this.b) / 1000 <= ((long) PreviewManager.b);
    }

    public Uri c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("eb8a50a1", new Object[]{this}) : this.c;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f6674a = false;
        this.c = null;
        this.b = 0L;
    }
}
