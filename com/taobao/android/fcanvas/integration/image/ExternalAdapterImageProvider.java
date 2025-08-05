package com.taobao.android.fcanvas.integration.image;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Map;
import java.util.Vector;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public interface ExternalAdapterImageProvider {

    /* loaded from: classes5.dex */
    public interface a {
        Bitmap a();

        double b();

        int c();
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(Image image);
    }

    b request(String str, int i, int i2, Map<String, String> map, Map<String, String> map2, c cVar);

    /* loaded from: classes5.dex */
    public static final class Image {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final a animatedBitmap;
        private final Vector<Bitmap> bitmaps;
        private final double duration;
        private final int frameCount;
        private final boolean isSingleBitmapAnimated;

        static {
            kge.a(-1178154222);
        }

        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            }
        }

        public void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            }
        }

        public Image(Bitmap bitmap) {
            this.bitmaps = new Vector<>();
            this.bitmaps.add(bitmap);
            this.duration = mto.a.GEO_NOT_SUPPORT;
            this.frameCount = 1;
            this.isSingleBitmapAnimated = false;
            this.animatedBitmap = null;
        }

        public Image(Vector<Bitmap> vector, double d) {
            this.bitmaps = vector;
            this.duration = d < mto.a.GEO_NOT_SUPPORT ? 1.0d : d;
            this.frameCount = vector.size();
            this.isSingleBitmapAnimated = false;
            this.animatedBitmap = null;
        }

        public Image(a aVar) {
            this.bitmaps = new Vector<>();
            this.bitmaps.add(aVar.a());
            this.duration = aVar.b();
            this.frameCount = aVar.c();
            this.isSingleBitmapAnimated = true;
            this.animatedBitmap = aVar;
        }

        public double getDuration() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a7f", new Object[]{this})).doubleValue() : this.duration;
        }

        public int getFrameCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bea4412", new Object[]{this})).intValue() : this.frameCount;
        }

        public int getBitmapCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b159b64", new Object[]{this})).intValue() : this.bitmaps.size();
        }

        public boolean isMultiframe() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd1a3229", new Object[]{this})).booleanValue() : this.frameCount > 1;
        }

        public boolean isSingleBitmapAnimated() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("748fad2f", new Object[]{this})).booleanValue() : this.isSingleBitmapAnimated;
        }

        public Bitmap getBitmap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
            }
            if (this.bitmaps.size() <= 0) {
                return null;
            }
            return this.bitmaps.firstElement();
        }

        public Bitmap getBitmap(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("a623b435", new Object[]{this, new Integer(i)});
            }
            if (i >= this.bitmaps.size()) {
                return null;
            }
            return this.bitmaps.elementAt(i);
        }

        public Bitmap[] getBitmaps() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap[]) ipChange.ipc$dispatch("1b91bbfa", new Object[]{this});
            }
            Object[] array = this.bitmaps.toArray();
            return (Bitmap[]) Arrays.copyOf(array, array.length, Bitmap[].class);
        }
    }
}
