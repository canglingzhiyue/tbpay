package tb;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.utils.a;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.android.mnncv.MNNCVImage;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class sfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2075104212);
    }

    public static /* synthetic */ void a(Float f, float f2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a68b03", new Object[]{f, new Float(f2), view});
        } else {
            b(f, f2, view);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : TextUtils.equals("h", ldc.a());
    }

    public static void a(final View view, ppj ppjVar) {
        final Point a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc68130", new Object[]{view, ppjVar});
        } else if (view == null || ppjVar == null || !ppjVar.t || ppjVar.s || ppjVar.r == null || ppjVar.q == ppjVar.p || (a2 = a(ppjVar.r)) == null) {
        } else {
            final float f = ppjVar.p;
            final float f2 = ppjVar.q;
            ljd.a().b(new Runnable() { // from class: tb.sfr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    float f3 = f;
                    if (view.getScaleX() != f) {
                        f3 = view.getScaleX();
                    }
                    view.setPivotX(a2.x);
                    view.setPivotY(a2.y);
                    sfr.a(Float.valueOf(f3), f2, view);
                }
            });
            ppjVar.p = ppjVar.q;
        }
    }

    private static void b(Float f, float f2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0bc022", new Object[]{f, new Float(f2), view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f.floatValue(), f2);
        ofFloat.setDuration(200L);
        ofFloat.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f.floatValue(), f2);
        ofFloat2.setDuration(200L);
        ofFloat2.start();
    }

    private static Point a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("169f2428", new Object[]{rect});
        }
        int i = (rect.right + rect.left) / 2;
        int i2 = (rect.bottom + rect.top) / 2;
        if (i > 0 && i2 > 0) {
            return new Point(i, i2);
        }
        return null;
    }

    public static Bitmap a(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("58a42a68", new Object[]{tBLiveOpenCardView});
        }
        if (tBLiveOpenCardView == null) {
            ldf.d(FaceDetectionNet.BIZ_NAME, "parentView or videoContainer is null");
            return null;
        }
        List<TextureView> b = b(tBLiveOpenCardView);
        if (b.isEmpty()) {
            ldf.d(FaceDetectionNet.BIZ_NAME, "view list is empty");
            return null;
        }
        TextureView textureView = b.get(0);
        if (textureView == null) {
            ldf.d(FaceDetectionNet.BIZ_NAME, "TextureView is null");
            return null;
        }
        try {
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap == null) {
                ldf.d(FaceDetectionNet.BIZ_NAME, "getBitmap is null");
                return null;
            }
            int width = (bitmap.getWidth() - tBLiveOpenCardView.getWidth()) / 2;
            int height = (bitmap.getHeight() - tBLiveOpenCardView.getHeight()) / 2;
            if (width >= 0 && height >= 0) {
                return Bitmap.createBitmap(bitmap, width, height, tBLiveOpenCardView.getWidth(), tBLiveOpenCardView.getHeight());
            }
            return null;
        } catch (NullPointerException unused) {
            ldf.d(FaceDetectionNet.BIZ_NAME, "Texture内部初始化异常或被回收");
            return null;
        }
    }

    private static List<TextureView> b(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("819282fe", new Object[]{tBLiveOpenCardView});
        }
        ViewGroup playerRootView = tBLiveOpenCardView.getPlayerRootView();
        ArrayList arrayList = new ArrayList();
        if (playerRootView != null && playerRootView.getChildCount() > 0) {
            for (int i = 0; i < playerRootView.getChildCount(); i++) {
                View childAt = playerRootView.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    arrayList.addAll(a((ViewGroup) childAt));
                } else if (childAt instanceof TextureView) {
                    arrayList.add((TextureView) childAt);
                }
            }
        }
        return arrayList;
    }

    private static List<TextureView> a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc92ec0", new Object[]{viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(a((ViewGroup) childAt));
            } else if (childAt instanceof TextureView) {
                arrayList.add((TextureView) childAt);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> a(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3831ad45", new Object[]{bitmap, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(a.f6802a, new MNNCVImage(bitmap));
        hashMap.put("_width", Integer.valueOf(bitmap.getWidth()));
        hashMap.put("_height", Integer.valueOf(bitmap.getHeight()));
        hashMap.put(a.d, 0);
        hashMap.put("_bizcode", str);
        return hashMap;
    }

    public static Rect a(Map<String, Object> map, TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("691ca3fe", new Object[]{map, tBLiveOpenCardView});
        }
        Object obj = map.get("algo_results");
        boolean z = !(obj instanceof Map);
        Map map2 = (Map) obj;
        if (map2 == null) {
            z = true;
        }
        ArrayList arrayList = (ArrayList) map2.get("body_region");
        if (arrayList == null || arrayList.size() < 4) {
            z = true;
        }
        if (!z) {
            return new Rect(((Integer) arrayList.get(0)).intValue() + tBLiveOpenCardView.getLeft(), ((Integer) arrayList.get(1)).intValue() + tBLiveOpenCardView.getTop(), ((Integer) arrayList.get(2)).intValue() + tBLiveOpenCardView.getLeft(), ((Integer) arrayList.get(3)).intValue() + tBLiveOpenCardView.getTop());
        }
        return null;
    }

    public static String[] a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b7ef335a", new Object[]{hashMap});
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        String[] strArr = new String[entrySet.size()];
        for (Map.Entry<String, String> entry : entrySet) {
            strArr[i] = entry.getKey() + "=" + entry.getValue();
            i++;
        }
        return strArr;
    }
}
