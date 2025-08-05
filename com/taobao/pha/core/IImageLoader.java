package com.taobao.pha.core;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public interface IImageLoader {

    /* loaded from: classes7.dex */
    public enum ImageQuality {
        ORIGINAL,
        LOW,
        NORMAL,
        HIGH,
        AUTO
    }

    /* loaded from: classes7.dex */
    public interface a {
        void a(String str, ImageView imageView, boolean z, Map<String, WeakReference<BitmapDrawable>> map);
    }

    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18706a;
        public String b;
        public a c;

        static {
            kge.a(525320550);
        }
    }

    void a(ImageView imageView, String str);

    void a(ImageView imageView, String str, ImageQuality imageQuality, b bVar);
}
