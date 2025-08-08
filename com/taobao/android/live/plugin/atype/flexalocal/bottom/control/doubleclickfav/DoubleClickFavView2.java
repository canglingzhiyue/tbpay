package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.doubleclickfav;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taolive.sdk.utils.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.plx;
import tb.pmd;

/* loaded from: classes5.dex */
public class DoubleClickFavView2 extends View implements com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_DP = 60;
    private static final String TAG = "DoubleClickFavView";
    private int ANIMATED_TIME;
    private int heightLike;
    private int index;
    private ArrayList<Drawable> mBitmapDrawables;
    private ArrayList<Drawable> mDefaultDrawables;
    private Handler mHandler;
    private boolean mHasExecute;
    private float mMaxRatio;
    private List<c> mPointFavs;
    private Runnable mRunnable;
    private volatile boolean mUseDefault;
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;
    private int widthLike;

    static {
        kge.a(-1953430776);
        kge.a(-844364448);
    }

    public static /* synthetic */ Object ipc$super(DoubleClickFavView2 doubleClickFavView2, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List access$000(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("37a79f65", new Object[]{doubleClickFavView2}) : doubleClickFavView2.mPointFavs;
    }

    public static /* synthetic */ Runnable access$100(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("1e6dcc33", new Object[]{doubleClickFavView2}) : doubleClickFavView2.mRunnable;
    }

    public static /* synthetic */ float access$1000(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1e89f03", new Object[]{doubleClickFavView2})).floatValue() : doubleClickFavView2.mMaxRatio;
    }

    public static /* synthetic */ int access$1100(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f555c25", new Object[]{doubleClickFavView2})).intValue() : doubleClickFavView2.widthLike;
    }

    public static /* synthetic */ int access$1200(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccc21944", new Object[]{doubleClickFavView2})).intValue() : doubleClickFavView2.heightLike;
    }

    public static /* synthetic */ ArrayList access$1300(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("40c6ebd9", new Object[]{context}) : createDefaultDrawables(context);
    }

    public static /* synthetic */ boolean access$1400(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a79b9393", new Object[]{doubleClickFavView2})).booleanValue() : doubleClickFavView2.mUseDefault;
    }

    public static /* synthetic */ ArrayList access$1500(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("8ba21188", new Object[]{doubleClickFavView2}) : doubleClickFavView2.mDefaultDrawables;
    }

    public static /* synthetic */ ArrayList access$1502(DoubleClickFavView2 doubleClickFavView2, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3d316b98", new Object[]{doubleClickFavView2, arrayList});
        }
        doubleClickFavView2.mDefaultDrawables = arrayList;
        return arrayList;
    }

    public static /* synthetic */ boolean access$1602(DoubleClickFavView2 doubleClickFavView2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d33ca4ad", new Object[]{doubleClickFavView2, new Boolean(z)})).booleanValue();
        }
        doubleClickFavView2.mHasExecute = z;
        return z;
    }

    public static /* synthetic */ Handler access$200(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a3cfede6", new Object[]{doubleClickFavView2}) : doubleClickFavView2.mHandler;
    }

    public static /* synthetic */ int access$300(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2bd391f2", new Object[]{doubleClickFavView2})).intValue() : doubleClickFavView2.minWidth;
    }

    public static /* synthetic */ int access$400(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("99404f11", new Object[]{doubleClickFavView2})).intValue() : doubleClickFavView2.maxWidth;
    }

    public static /* synthetic */ int access$500(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ad0c30", new Object[]{doubleClickFavView2})).intValue() : doubleClickFavView2.minHeight;
    }

    public static /* synthetic */ int access$600(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7419c94f", new Object[]{doubleClickFavView2})).intValue() : doubleClickFavView2.maxHeight;
    }

    public static /* synthetic */ ArrayList access$700(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ee705ed5", new Object[]{doubleClickFavView2}) : doubleClickFavView2.mBitmapDrawables;
    }

    public static /* synthetic */ int access$800(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ef3438d", new Object[]{doubleClickFavView2})).intValue() : doubleClickFavView2.ANIMATED_TIME;
    }

    public static /* synthetic */ void access$900(DoubleClickFavView2 doubleClickFavView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6000b9", new Object[]{doubleClickFavView2});
        } else {
            doubleClickFavView2.reset();
        }
    }

    public DoubleClickFavView2(Context context) {
        this(context, null);
    }

    public DoubleClickFavView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DoubleClickFavView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ANIMATED_TIME = 750;
        this.mMaxRatio = 1.5f;
        this.mUseDefault = true;
        this.mHasExecute = false;
        this.mRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.doubleclickfav.DoubleClickFavView2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : new ArrayList(DoubleClickFavView2.access$000(DoubleClickFavView2.this))) {
                    cVar.a();
                }
                DoubleClickFavView2.this.invalidate();
                DoubleClickFavView2.access$200(DoubleClickFavView2.this).removeCallbacks(DoubleClickFavView2.access$100(DoubleClickFavView2.this));
                if (DoubleClickFavView2.access$000(DoubleClickFavView2.this).isEmpty()) {
                    return;
                }
                DoubleClickFavView2.access$200(DoubleClickFavView2.this).postDelayed(DoubleClickFavView2.access$100(DoubleClickFavView2.this), 16L);
            }
        };
        this.mPointFavs = new ArrayList();
        this.mBitmapDrawables = new ArrayList<>();
        this.widthLike = com.taobao.taolive.sdk.utils.b.a(context, 60.0f);
        this.heightLike = com.taobao.taolive.sdk.utils.b.a(context, 60.0f);
        int i2 = this.heightLike;
        this.minHeight = (int) (i2 * 2.5d);
        this.maxHeight = (int) (i2 * 3.5d);
        int i3 = this.widthLike;
        this.minWidth = (int) (i3 * 0.5d);
        this.maxWidth = (int) (i3 * 1.5d);
        this.mDefaultDrawables = new ArrayList<>();
        this.mHandler = new Handler(Looper.getMainLooper());
        setDefaultDrawables();
    }

    public void checkFavorPicByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e8e5f5", new Object[]{this, str});
            return;
        }
        plx.a(TAG, "checkFavorPicByUrl = " + str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        com.taobao.taolive.room.service.b.a().a(str, new FavorAnimView2.a(this));
    }

    public void setMaxRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8573aa30", new Object[]{this, new Float(f)});
        } else {
            this.mMaxRatio = f;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        for (c cVar : this.mPointFavs) {
            drawPointFavNew(canvas, cVar);
        }
    }

    private void drawPointFavNew(Canvas canvas, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b366a2d", new Object[]{this, canvas, cVar});
            return;
        }
        canvas.save();
        canvas.rotate(cVar.e, cVar.f13578a.x, cVar.f13578a.y);
        int i = cVar.t;
        if (i < 0 || i >= this.mBitmapDrawables.size()) {
            return;
        }
        Drawable drawable = this.mBitmapDrawables.get(i);
        if (!(drawable instanceof BitmapDrawable)) {
            return;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        if (bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
            pmd.a().n().a("taolive", "DoubleClickBitmapRecycled", 1.0d);
            return;
        }
        bitmapDrawable.setBounds(cVar.j, cVar.k, cVar.l, cVar.m);
        bitmapDrawable.setAlpha(cVar.n);
        bitmapDrawable.draw(canvas);
        canvas.restore();
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.index = 0;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ArrayList<Drawable> arrayList = this.mBitmapDrawables;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator<Drawable> it = this.mBitmapDrawables.iterator();
        while (it.hasNext()) {
            Drawable next = it.next();
            if ((next instanceof BitmapDrawable) && next != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) next;
                if (bitmapDrawable.getBitmap() != null) {
                    bitmapDrawable.getBitmap().recycle();
                }
            }
        }
        this.mBitmapDrawables.clear();
    }

    public void showDoubleClickFav(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78091a7f", new Object[]{this, pointF});
            return;
        }
        int size = this.mBitmapDrawables.size();
        if (size <= 0) {
            return;
        }
        List<c> list = this.mPointFavs;
        int i = this.index + 1;
        this.index = i;
        list.add(new c(Math.min((i % size) + 3, size), size, pointF));
        this.mHandler.post(this.mRunnable);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.a
    public void setDrawables(ArrayList<Drawable> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cafcd90", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            this.mUseDefault = false;
            this.mBitmapDrawables = arrayList;
            Iterator<Drawable> it = arrayList.iterator();
            while (it.hasNext()) {
                q.a(TAG, "setDrawables:" + it.next().toString());
            }
        }
    }

    public void setDefaultDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9817c5d", new Object[]{this});
        } else if (!this.mUseDefault) {
        } else {
            if (this.mDefaultDrawables.size() <= 0) {
                if (this.mHasExecute) {
                    return;
                }
                this.mHasExecute = true;
                new a(getContext()).execute(new Object[0]);
                return;
            }
            this.mBitmapDrawables.clear();
            this.mBitmapDrawables.addAll(this.mDefaultDrawables);
        }
    }

    /* loaded from: classes5.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final PointF f13578a;
        public final long b = System.currentTimeMillis();
        public final int c;
        public final int[] d;
        public final float e;
        public final float[] f;
        public final float[] g;
        public final int[] h;
        public final int[] i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int[] o;
        public int[] p;
        public int[] q;
        public int[] r;
        public int[] s;
        public int t;

        static {
            kge.a(1601173927);
        }

        public c(int i, int i2, PointF pointF) {
            this.f13578a = pointF;
            this.c = i;
            int i3 = this.c;
            this.d = new int[i3];
            this.f = new float[i3];
            this.g = new float[i3];
            this.o = new int[i3];
            this.p = new int[i3];
            this.q = new int[i3];
            this.r = new int[i3];
            this.s = new int[i3];
            this.h = new int[i3];
            this.i = new int[i3];
            Random random = new Random();
            this.e = random.nextInt(40) - 20;
            for (int i4 = 0; i4 < this.c; i4++) {
                this.d[i4] = random.nextInt(i2) % i2;
                this.f[i4] = random.nextInt(20) - 10;
                this.g[i4] = (110.0f - random.nextInt(20)) / 100.0f;
                this.h[i4] = DoubleClickFavView2.access$300(DoubleClickFavView2.this) + random.nextInt(DoubleClickFavView2.access$400(DoubleClickFavView2.this) - DoubleClickFavView2.access$300(DoubleClickFavView2.this));
                this.i[i4] = DoubleClickFavView2.access$500(DoubleClickFavView2.this) + random.nextInt(DoubleClickFavView2.access$600(DoubleClickFavView2.this) - DoubleClickFavView2.access$500(DoubleClickFavView2.this));
            }
            this.t = (int) (Math.random() * DoubleClickFavView2.access$700(DoubleClickFavView2.this).size());
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            float currentTimeMillis = (float) (System.currentTimeMillis() - this.b);
            if (currentTimeMillis > DoubleClickFavView2.access$800(DoubleClickFavView2.this) || currentTimeMillis < 0.0f) {
                DoubleClickFavView2.access$000(DoubleClickFavView2.this).remove(this);
                if (!DoubleClickFavView2.access$000(DoubleClickFavView2.this).isEmpty()) {
                    return;
                }
                DoubleClickFavView2.access$900(DoubleClickFavView2.this);
                return;
            }
            float access$800 = currentTimeMillis / DoubleClickFavView2.access$800(DoubleClickFavView2.this);
            float access$1000 = DoubleClickFavView2.access$1000(DoubleClickFavView2.this) * access$800;
            if (access$800 > 0.5d) {
                this.n = (int) (((1.0f - access$800) * 255.0f) / 0.5f);
            } else {
                this.n = 255;
            }
            float access$1100 = (DoubleClickFavView2.access$1100(DoubleClickFavView2.this) * access$1000) / 2.0f;
            float access$1200 = (DoubleClickFavView2.access$1200(DoubleClickFavView2.this) * access$1000) / 2.0f;
            this.j = (int) (this.f13578a.x - access$1100);
            this.l = (int) (this.f13578a.x + access$1100);
            this.k = (int) (this.f13578a.y - access$1200);
            this.m = (int) (this.f13578a.y + access$1200);
        }
    }

    /* loaded from: classes5.dex */
    public class a extends AsyncTask<Object, Object, ArrayList<Drawable>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WeakReference<Context> b;

        static {
            kge.a(-1740828725);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList<android.graphics.drawable.Drawable>, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ ArrayList<Drawable> doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, arrayList});
            } else {
                a(arrayList);
            }
        }

        public a(Context context) {
            this.b = new WeakReference<>(context);
        }

        public ArrayList<Drawable> a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("30885b23", new Object[]{this, objArr});
            }
            Context context = this.b.get();
            if (context != null) {
                return DoubleClickFavView2.access$1300(context);
            }
            return new ArrayList<>();
        }

        public void a(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                return;
            }
            if (DoubleClickFavView2.access$1400(DoubleClickFavView2.this)) {
                DoubleClickFavView2.access$1502(DoubleClickFavView2.this, arrayList);
                DoubleClickFavView2.access$700(DoubleClickFavView2.this).clear();
                DoubleClickFavView2.access$700(DoubleClickFavView2.this).addAll(DoubleClickFavView2.access$1500(DoubleClickFavView2.this));
            }
            DoubleClickFavView2.access$1602(DoubleClickFavView2.this, false);
        }
    }

    private static ArrayList<Drawable> createDefaultDrawables(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ca5cb10b", new Object[]{context});
        }
        ArrayList<Drawable> arrayList = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        com.taobao.phenix.intf.b h = com.taobao.phenix.intf.b.h();
        h.a("https://gw.alicdn.com/imgextra/i2/O1CN01UNMgNM1PP6SPt2gPW_!!6000000001832-2-tps-60-60.png").succListener(new b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i2/O1CN01m3OD2o27GiIRc2rTK_!!6000000007770-2-tps-60-60.png").succListener(new b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i4/O1CN01HTqL5y1nTGqAolERQ_!!6000000005090-2-tps-60-60.png").succListener(new b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i1/O1CN01DTGVml1eprq657njs_!!6000000003921-2-tps-60-60.png").succListener(new b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i1/O1CN01pszcl823m4xHMmJ1B_!!6000000007297-2-tps-60-60.png").succListener(new b(arrayList, countDownLatch));
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            plx.b(TAG, th.getMessage());
        }
        return arrayList;
    }

    /* loaded from: classes5.dex */
    public static final class b implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<Drawable> f13577a;
        private final CountDownLatch b;

        static {
            kge.a(1861873927);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public b(ArrayList<Drawable> arrayList, CountDownLatch countDownLatch) {
            this.f13577a = arrayList;
            this.b = countDownLatch;
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (this.f13577a != null && succPhenixEvent != null && succPhenixEvent.getDrawable() != null) {
                this.f13577a.add(succPhenixEvent.getDrawable());
            }
            CountDownLatch countDownLatch = this.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            return false;
        }
    }
}
