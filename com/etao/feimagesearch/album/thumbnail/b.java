package com.etao.feimagesearch.album.thumbnail;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class b implements com.etao.feimagesearch.album.thumbnail.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<e, a> f6501a = new LinkedHashMap();

    static {
        kge.a(1273015565);
        kge.a(-80911844);
    }

    @Override // com.etao.feimagesearch.album.thumbnail.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f6501a.isEmpty()) {
            for (a aVar : this.f6501a.values()) {
                aVar.cancel(true);
            }
            this.f6501a.clear();
        }
    }

    @Override // com.etao.feimagesearch.album.thumbnail.a
    public void a(e task) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb734e4", new Object[]{this, task});
            return;
        }
        q.c(task, "task");
        a aVar = new a(task, new MediaThumbnailExecutor$executeTask$asyncTask$1(this, task));
        this.f6501a.put(task, aVar);
        try {
            aVar.execute(new Void[0]);
        } catch (Throwable unused) {
        }
    }

    @Override // com.etao.feimagesearch.album.thumbnail.a
    public void b(e task) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4315b25", new Object[]{this, task});
            return;
        }
        q.c(task, "task");
        a remove = this.f6501a.remove(task);
        if (remove == null) {
            return;
        }
        remove.cancel(true);
    }

    /* loaded from: classes3.dex */
    public static final class a extends AsyncTask<Void, Void, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private e f6502a;
        private rul<? super e, t> b;

        static {
            kge.a(-455444506);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [android.graphics.Bitmap, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, bitmap});
            } else {
                a(bitmap);
            }
        }

        public a(e thumbnailLoadTask, rul<? super e, t> afterPostExecute) {
            q.c(thumbnailLoadTask, "thumbnailLoadTask");
            q.c(afterPostExecute, "afterPostExecute");
            this.f6502a = thumbnailLoadTask;
            this.b = afterPostExecute;
        }

        public Bitmap a(Void... params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("e1e32632", new Object[]{this, params});
            }
            q.c(params, "params");
            if (Thread.interrupted()) {
                return null;
            }
            try {
                return com.etao.feimagesearch.util.d.a(this.f6502a.b());
            } catch (Throwable unused) {
                return null;
            }
        }

        public void a(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                return;
            }
            super.onPostExecute(bitmap);
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            this.f6502a.c().setImageBitmap(bitmap);
            this.b.mo2421invoke(this.f6502a);
        }
    }
}
