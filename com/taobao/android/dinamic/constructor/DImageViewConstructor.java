package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpn;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class DImageViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEIGHT_LIMIT = "heightLimit";
    private static final String IMAGEVIEW_ASPECT_RATIO = "dAspectRatio";
    private static final String IMAGEVIEW_IMAGE_URL = "dImageUrl";
    private static final String IMAGEVIEW_LOCAL_IMAGE = "dImage";
    private static final String IMAGEVIEW_LOCAL_IMAGE_NAME = "dImageName";
    private static final String IMAGEVIEW_SCALE_TYPE = "dScaleType";
    private static final String IMAGEVIEW_SCALE_TYPE_CENTER_CROP = "centerCrop";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_CENTER = "fitCenter";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_XY = "fitXY";
    public static final String TAG = "DImageViewConstructor";
    public static final String WIDTH_LIMIT = "widthLimit";
    private a dxWebImageInterface;

    /* loaded from: classes.dex */
    public interface a {
        ImageView a(Context context);

        void a(ImageView imageView, String str, b bVar);
    }

    static {
        kge.a(1211162134);
    }

    public static /* synthetic */ Object ipc$super(DImageViewConstructor dImageViewConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        a aVar = this.dxWebImageInterface;
        if (aVar == null) {
            return new ImageView(context);
        }
        return aVar.a(context);
    }

    private void setImage(ImageView imageView, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213eedff", new Object[]{this, imageView, str, bVar});
            return;
        }
        a aVar = this.dxWebImageInterface;
        if (aVar == null) {
            return;
        }
        aVar.a(imageView, str, bVar);
    }

    public void setDxWebImageInterface(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56cb9f", new Object[]{this, aVar});
        } else {
            this.dxWebImageInterface = aVar;
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        ImageView imageView = (ImageView) view;
        if (arrayList.contains(IMAGEVIEW_LOCAL_IMAGE)) {
            setLocalImage(imageView, (Drawable) map.get(IMAGEVIEW_LOCAL_IMAGE));
        }
        if (arrayList.contains(IMAGEVIEW_LOCAL_IMAGE_NAME)) {
            setLocalRes(imageView, (String) map.get(IMAGEVIEW_LOCAL_IMAGE_NAME));
        }
        if (arrayList.contains(IMAGEVIEW_SCALE_TYPE)) {
            setImageScaleType(imageView, (String) map.get(IMAGEVIEW_SCALE_TYPE));
        }
        String str = (String) map.get("dWidth");
        String str2 = (String) map.get("dHeight");
        b bVar = new b();
        bVar.d = fpdVar.b();
        if (StringUtils.equals(str, "match_content") && !StringUtils.equals(str2, "match_content")) {
            bVar.e = "heightLimit";
            b.a(bVar, true);
            imageView.setAdjustViewBounds(true);
        } else if (!StringUtils.equals(str, "match_content") && StringUtils.equals(str2, "match_content")) {
            bVar.e = "widthLimit";
            b.a(bVar, true);
            imageView.setAdjustViewBounds(true);
        }
        if (arrayList.contains(IMAGEVIEW_ASPECT_RATIO)) {
            setAspectRatio(imageView, str, str2, (String) map.get(IMAGEVIEW_ASPECT_RATIO), bVar);
            if (bVar.c()) {
                setImageScaleType(imageView, (String) map.get(IMAGEVIEW_SCALE_TYPE));
            }
        }
        if (arrayList.contains("dCornerRadius")) {
            bVar.f11734a = (String) map.get("dCornerRadius");
            b.b(bVar, true);
        }
        if (arrayList.contains("dBorderColor")) {
            bVar.b = (String) map.get("dBorderColor");
            b.c(bVar, true);
        }
        if (arrayList.contains("dBorderWidth")) {
            bVar.c = (String) map.get("dBorderWidth");
            b.d(bVar, true);
        }
        if (arrayList.contains(IMAGEVIEW_IMAGE_URL)) {
            b.e(bVar, true);
        }
        setImage(imageView, (String) map.get(IMAGEVIEW_IMAGE_URL), bVar);
    }

    private void setLocalImage(ImageView imageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7447257", new Object[]{this, imageView, drawable});
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setAspectRatio(ImageView imageView, String str, String str2, String str3, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907947cb", new Object[]{this, imageView, str, str2, str3, bVar});
            return;
        }
        boolean z = !StringUtils.equals(str, "match_content") && StringUtils.equals(str2, "match_content");
        if (!z && (!StringUtils.equals(str, "match_content") || StringUtils.equals(str2, "match_content"))) {
            return;
        }
        double d = -1.0d;
        try {
            if (!StringUtils.isEmpty(str3)) {
                d = Double.valueOf(str3).doubleValue();
            }
        } catch (Throwable unused) {
        }
        if (z) {
            if (d > mto.a.GEO_NOT_SUPPORT) {
                bVar.f = (float) (1.0d / d);
                bVar.g = 0;
                b.f(bVar, true);
            } else if (imageView.getLayoutParams() == null) {
            } else {
                imageView.getLayoutParams().height = 0;
            }
        } else if (d > mto.a.GEO_NOT_SUPPORT) {
            bVar.f = (float) d;
            bVar.g = 1;
            b.f(bVar, true);
        } else if (imageView.getLayoutParams() == null) {
        } else {
            imageView.getLayoutParams().width = 0;
        }
    }

    public void setLocalRes(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9e6ac2", new Object[]{this, imageView, str});
            return;
        }
        imageView.setTag(j.TAG_CURRENT_IMAGE_NAME, str);
        if (str == null) {
            imageView.setImageDrawable(null);
            imageView.setTag(j.TAG_IMAGE_NAME, null);
        } else if (str.equals((String) imageView.getTag(j.TAG_IMAGE_NAME))) {
        } else {
            new c(imageView, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends AsyncTask<Void, Void, Drawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f11735a;
        private WeakReference<ImageView> b;
        private Context c;

        static {
            kge.a(-1189189577);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.graphics.drawable.Drawable] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, drawable});
            } else {
                a(drawable);
            }
        }

        public c(ImageView imageView, String str) {
            this.b = new WeakReference<>(imageView);
            this.f11735a = str;
            this.c = imageView.getContext().getApplicationContext();
        }

        public Drawable a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("3d6535e6", new Object[]{this, voidArr});
            }
            int a2 = a(this.c, this.f11735a);
            Drawable drawable = null;
            if (a2 == 0) {
                return null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = this.c.getDrawable(a2);
                } else {
                    drawable = this.c.getResources().getDrawable(a2);
                }
            } catch (Exception e) {
                Log.e(DImageViewConstructor.TAG, "Get layout parser exception", e);
            }
            return drawable;
        }

        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                return;
            }
            ImageView imageView = this.b.get();
            if (imageView == null || !this.f11735a.equals((String) imageView.getTag(j.TAG_CURRENT_IMAGE_NAME))) {
                return;
            }
            imageView.setImageDrawable(drawable);
            imageView.setTag(j.TAG_IMAGE_NAME, this.f11735a);
        }

        private int a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
            }
            if (context == null || StringUtils.isEmpty(str)) {
                return 0;
            }
            try {
                return context.getResources().getIdentifier(str, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
            } catch (Exception e) {
                Log.e(DImageViewConstructor.TAG, "getDrawableId exception", e);
                return 0;
            }
        }
    }

    public void setImageScaleType(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5760896", new Object[]{this, imageView, str});
        } else if (StringUtils.isEmpty(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (IMAGEVIEW_SCALE_TYPE_FIT_XY.equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if ("fitCenter".equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if ("centerCrop".equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setBackground(View view, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c88fce3", new Object[]{this, view, str, str2, str3, str4});
        } else {
            view.setBackgroundColor(fpn.a(str4, 0));
        }
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11734a;
        public String b;
        public String c;
        public String d;
        public String e;
        public float f;
        public int g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        static {
            kge.a(-1843805182);
        }

        public static /* synthetic */ boolean a(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7297a5f5", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.k = z;
            return z;
        }

        public static /* synthetic */ boolean b(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab780694", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.j = z;
            return z;
        }

        public static /* synthetic */ boolean c(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4586733", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.h = z;
            return z;
        }

        public static /* synthetic */ boolean d(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1d38c7d2", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.i = z;
            return z;
        }

        public static /* synthetic */ boolean e(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56192871", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.l = z;
            return z;
        }

        public static /* synthetic */ boolean f(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ef98910", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.m = z;
            return z;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.l;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.j;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.k;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.i;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.m;
        }
    }
}
