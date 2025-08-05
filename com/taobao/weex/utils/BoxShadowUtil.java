package com.taobao.weex.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class BoxShadowUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23522a;
    private static Pattern b;

    public static /* synthetic */ void a(WXSDKInstance wXSDKInstance, View view, List list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c89aee", new Object[]{wXSDKInstance, view, list, new Float(f), fArr});
        } else {
            b(wXSDKInstance, view, list, f, fArr);
        }
    }

    public static /* synthetic */ void b(View view, List list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b8ec11", new Object[]{view, list, new Float(f), fArr});
        } else {
            d(view, list, f, fArr);
        }
    }

    static {
        kge.a(1688074900);
        f23522a = true;
    }

    public static void setBoxShadowEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f333b5", new Object[]{new Boolean(z)});
            return;
        }
        f23522a = z;
        WXLogUtils.w("BoxShadowUtil", "Switch box-shadow status: " + z);
    }

    public static boolean isBoxShadowEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc6f7bcb", new Object[0])).booleanValue() : f23522a;
    }

    public static void setBoxShadow(final WXSDKInstance wXSDKInstance, final View view, String str, final float[] fArr, int i, final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84608a6", new Object[]{wXSDKInstance, view, str, fArr, new Integer(i), new Float(f)});
        } else if (!f23522a) {
            WXLogUtils.w("BoxShadowUtil", "box-shadow was disabled by config");
        } else if (view == null) {
            WXLogUtils.w("BoxShadowUtil", "Target view is null!");
        } else if (TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= 18) {
            view.getOverlay().clear();
            WXLogUtils.d("BoxShadowUtil", "Remove all box-shadow");
        } else {
            BoxShadowOptions[] parseBoxShadows = parseBoxShadows(wXSDKInstance, str, i);
            if (parseBoxShadows == null || parseBoxShadows.length == 0) {
                WXLogUtils.w("BoxShadowUtil", "Failed to parse box-shadow: " + str);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            for (BoxShadowOptions boxShadowOptions : parseBoxShadows) {
                if (boxShadowOptions != null) {
                    if (boxShadowOptions.isInset) {
                        arrayList2.add(0, boxShadowOptions);
                    } else {
                        arrayList.add(0, boxShadowOptions);
                    }
                }
            }
            if (fArr != null) {
                if (fArr.length != 8) {
                    WXLogUtils.w("BoxShadowUtil", "Length of radii must be 8");
                } else {
                    for (int i2 = 0; i2 < fArr.length; i2++) {
                        fArr[i2] = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, fArr[i2], i);
                    }
                }
            }
            view.post(WXThread.secure(new Runnable() { // from class: com.taobao.weex.utils.BoxShadowUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (Build.VERSION.SDK_INT < 18) {
                    } else {
                        view.getOverlay().clear();
                        if (arrayList.size() > 0) {
                            BoxShadowUtil.a(wXSDKInstance, view, arrayList, f, fArr);
                        }
                        if (arrayList2.size() <= 0) {
                            return;
                        }
                        BoxShadowUtil.b(view, arrayList2, f, fArr);
                    }
                }
            }));
        }
    }

    private static void a(Canvas canvas, BoxShadowOptions boxShadowOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d034149", new Object[]{canvas, boxShadowOptions});
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, boxShadowOptions.viewWidth + (boxShadowOptions.spread * 2.0f), boxShadowOptions.viewHeight + (boxShadowOptions.spread * 2.0f));
        if (boxShadowOptions.topLeft != null) {
            rectF.offset(boxShadowOptions.topLeft.x, boxShadowOptions.topLeft.y);
        }
        float f = boxShadowOptions.blur;
        float f2 = boxShadowOptions.blur;
        if (boxShadowOptions.hShadow > 0.0f) {
            f += boxShadowOptions.hShadow * 2.0f;
        }
        if (boxShadowOptions.vShadow > 0.0f) {
            f2 += boxShadowOptions.vShadow * 2.0f;
        }
        rectF.offset(f, f2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(boxShadowOptions.color);
        paint.setStyle(Paint.Style.FILL);
        if (boxShadowOptions.blur > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(boxShadowOptions.blur, BlurMaskFilter.Blur.NORMAL));
        }
        Path path = new Path();
        float[] fArr = new float[8];
        for (int i = 0; i < boxShadowOptions.radii.length; i++) {
            if (boxShadowOptions.radii[i] == 0.0f) {
                fArr[i] = 0.0f;
            } else {
                fArr[i] = boxShadowOptions.radii[i] + boxShadowOptions.spread;
            }
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(path, paint);
    }

    private static void b(WXSDKInstance wXSDKInstance, View view, List<BoxShadowOptions> list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2039940d", new Object[]{wXSDKInstance, view, list, new Float(f), fArr});
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        view.getLayoutParams();
        if (height == 0 || width == 0 || Build.VERSION.SDK_INT < 18) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (BoxShadowOptions boxShadowOptions : list) {
            boxShadowOptions.viewWidth = width;
            boxShadowOptions.viewHeight = height;
            boxShadowOptions.radii = fArr;
            Rect targetCanvasRect = boxShadowOptions.getTargetCanvasRect();
            if (i < targetCanvasRect.width()) {
                i = targetCanvasRect.width();
            }
            if (i2 < targetCanvasRect.height()) {
                i2 = targetCanvasRect.height();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) (i * f), (int) (i2 * f), Bitmap.Config.ARGB_4444);
        if (Build.VERSION.SDK_INT >= 19) {
            WXLogUtils.d("BoxShadowUtil", "Allocation memory for box-shadow: " + (createBitmap.getAllocationByteCount() / 1024) + " KB");
        }
        Canvas canvas = new Canvas(createBitmap);
        for (BoxShadowOptions boxShadowOptions2 : list) {
            Rect targetCanvasRect2 = boxShadowOptions2.getTargetCanvasRect();
            boxShadowOptions2.topLeft = new PointF((i - targetCanvasRect2.width()) / 2.0f, (i2 - targetCanvasRect2.height()) / 2.0f);
            a(canvas, boxShadowOptions2.scale(wXSDKInstance, f));
        }
        OverflowBitmapDrawable overflowBitmapDrawable = new OverflowBitmapDrawable(view.getResources(), createBitmap, new Point((i - width) / 2, (i2 - height) / 2), new Rect(0, 0, width, height), fArr);
        view.getOverlay().add(overflowBitmapDrawable);
        ViewParent parent = view.getParent();
        if (parent == null) {
            return;
        }
        parent.requestLayout();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).invalidate(overflowBitmapDrawable.getBounds());
    }

    private static void d(View view, List<BoxShadowOptions> list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33bc993", new Object[]{view, list, new Float(f), fArr});
        } else if (view == null || list == null) {
            WXLogUtils.w("BoxShadowUtil", "Illegal arguments");
        } else if (view.getWidth() == 0 || view.getHeight() == 0) {
            WXLogUtils.w("BoxShadowUtil", "Target view is invisible, ignore set shadow.");
        } else if (Build.VERSION.SDK_INT >= 18) {
            Drawable[] drawableArr = new Drawable[list.size()];
            for (int i = 0; i < list.size(); i++) {
                BoxShadowOptions boxShadowOptions = list.get(i);
                drawableArr[i] = new InsetShadowDrawable(view.getWidth(), view.getHeight(), boxShadowOptions.hShadow, boxShadowOptions.vShadow, boxShadowOptions.blur, boxShadowOptions.spread, boxShadowOptions.color, fArr);
            }
            view.getOverlay().add(new LayerDrawable(drawableArr));
            view.invalidate();
        }
    }

    public static BoxShadowOptions[] parseBoxShadows(WXSDKInstance wXSDKInstance, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BoxShadowOptions[]) ipChange.ipc$dispatch("f70f733e", new Object[]{wXSDKInstance, str, new Integer(i)});
        }
        if (b == null) {
            b = Pattern.compile("([rR][gG][bB][aA]?)\\((\\d+\\s*),\\s*(\\d+\\s*),\\s*(\\d+\\s*)(?:,\\s*(\\d+(?:\\.\\d+)?))?\\)");
        }
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            str = str.replace(group, "#" + String.format("%8s", Integer.toHexString(WXResourceUtils.getColor(group, -16777216))).replaceAll("\\s", "0"));
        }
        String[] split = str.split(",");
        if (split == null || split.length <= 0) {
            return null;
        }
        BoxShadowOptions[] boxShadowOptionsArr = new BoxShadowOptions[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            boxShadowOptionsArr[i2] = a(wXSDKInstance, split[i2], i);
        }
        return boxShadowOptionsArr;
    }

    private static BoxShadowOptions a(WXSDKInstance wXSDKInstance, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BoxShadowOptions) ipChange.ipc$dispatch("e8effe8f", new Object[]{wXSDKInstance, str, new Integer(i)});
        }
        BoxShadowOptions boxShadowOptions = new BoxShadowOptions(wXSDKInstance, i);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("\\s*,\\s+", ",");
        if (replaceAll.contains("inset")) {
            boxShadowOptions.isInset = true;
            replaceAll = replaceAll.replace("inset", "");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(replaceAll.trim().split("\\s+")));
        String str2 = (String) arrayList.get(arrayList.size() - 1);
        if (!TextUtils.isEmpty(str2) && (str2.startsWith("#") || str2.startsWith("rgb") || WXResourceUtils.isNamedColor(str2))) {
            boxShadowOptions.color = WXResourceUtils.getColor(str2, -16777216);
            arrayList.remove(arrayList.size() - 1);
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (arrayList.size() < 2) {
            return null;
        }
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
            boxShadowOptions.hShadow = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, WXUtils.getFloat(((String) arrayList.get(0)).trim(), Float.valueOf(0.0f)).floatValue(), i);
        }
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(1))) {
            boxShadowOptions.vShadow = WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.getFloat(((String) arrayList.get(1)).trim(), Float.valueOf(0.0f)).floatValue(), i);
        }
        for (int i2 = 2; i2 < arrayList.size(); i2++) {
            ((BoxShadowOptions.IParser) BoxShadowOptions.a(boxShadowOptions).get(i2 - 2)).parse((String) arrayList.get(i2));
        }
        return boxShadowOptions;
    }

    /* loaded from: classes9.dex */
    public static class OverflowBitmapDrawable extends BitmapDrawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f23528a;
        private int b;
        private Rect c;
        private float[] d;

        static {
            kge.a(-925555777);
        }

        public static /* synthetic */ Object ipc$super(OverflowBitmapDrawable overflowBitmapDrawable, String str, Object... objArr) {
            if (str.hashCode() == -1665133574) {
                super.draw((Canvas) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private OverflowBitmapDrawable(Resources resources, Bitmap bitmap, Point point, Rect rect, float[] fArr) {
            super(resources, bitmap);
            this.f23528a = point.x;
            this.b = point.y;
            this.c = rect;
            this.d = fArr;
            setBounds(-this.f23528a, -this.b, rect.width() + this.f23528a, rect.height() + this.b);
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            Rect clipBounds = canvas.getClipBounds();
            Rect rect = new Rect(clipBounds);
            rect.inset((-this.f23528a) << 1, (-this.b) << 1);
            try {
                if (WXEnvironment.sApplication.getApplicationInfo().targetSdkVersion > 26) {
                    canvas.clipRect(rect);
                } else {
                    canvas.clipRect(rect, Region.Op.REPLACE);
                }
            } catch (NullPointerException unused) {
                canvas.clipRect(rect);
            }
            Path path = new Path();
            path.addRoundRect(new RectF(clipBounds), this.d, Path.Direction.CCW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.translate(clipBounds.left, clipBounds.top);
            super.draw(canvas);
        }
    }

    /* loaded from: classes9.dex */
    public static class InsetShadowDrawable extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f23527a;
        private int b;
        private float[] c;
        private float d;
        private float e;
        private float f;
        private float g;
        private Shader[] h;
        private Path[] i;
        private Paint j;

        static {
            kge.a(463505963);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            }
        }

        private InsetShadowDrawable(int i, int i2, float f, float f2, float f3, float f4, int i3, float[] fArr) {
            this.h = new Shader[4];
            this.i = new Path[4];
            this.f23527a = f3;
            this.b = i3;
            this.d = i + (f * 2.0f);
            this.e = i2 + (2.0f * f2);
            this.f = f + f4;
            this.g = f2 + f4;
            this.c = fArr;
            setBounds(0, 0, i, i2);
            a();
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            PointF pointF = new PointF(0.0f, 0.0f);
            PointF pointF2 = new PointF(this.d, 0.0f);
            PointF pointF3 = new PointF(pointF2.x, this.e);
            PointF pointF4 = new PointF(pointF.x, pointF3.y);
            PointF pointF5 = new PointF(this.f, this.g);
            PointF pointF6 = new PointF(pointF2.x - this.f, pointF5.y);
            PointF pointF7 = new PointF(pointF6.x, pointF3.y - this.g);
            PointF pointF8 = new PointF(pointF5.x, pointF7.y);
            LinearGradient linearGradient = new LinearGradient(pointF5.x - this.f23527a, pointF5.y, pointF5.x, pointF5.y, this.b, 0, Shader.TileMode.CLAMP);
            LinearGradient linearGradient2 = new LinearGradient(pointF5.x, pointF5.y - this.f23527a, pointF5.x, pointF5.y, this.b, 0, Shader.TileMode.CLAMP);
            LinearGradient linearGradient3 = new LinearGradient(pointF7.x + this.f23527a, pointF7.y, pointF7.x, pointF7.y, this.b, 0, Shader.TileMode.CLAMP);
            LinearGradient linearGradient4 = new LinearGradient(pointF7.x, pointF7.y + this.f23527a, pointF7.x, pointF7.y, this.b, 0, Shader.TileMode.CLAMP);
            Shader[] shaderArr = this.h;
            shaderArr[0] = linearGradient;
            shaderArr[1] = linearGradient2;
            shaderArr[2] = linearGradient3;
            shaderArr[3] = linearGradient4;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            path.lineTo(pointF5.x, pointF5.y);
            path.lineTo(pointF8.x, pointF8.y);
            path.lineTo(pointF4.x, pointF4.y);
            path.close();
            Path path2 = new Path();
            path2.moveTo(pointF.x, pointF.y);
            path2.lineTo(pointF2.x, pointF2.y);
            path2.lineTo(pointF6.x, pointF6.y);
            path2.lineTo(pointF5.x, pointF5.y);
            path2.close();
            Path path3 = new Path();
            path3.moveTo(pointF2.x, pointF2.y);
            path3.lineTo(pointF3.x, pointF3.y);
            path3.lineTo(pointF7.x, pointF7.y);
            path3.lineTo(pointF6.x, pointF6.y);
            path3.close();
            Path path4 = new Path();
            path4.moveTo(pointF4.x, pointF4.y);
            path4.lineTo(pointF3.x, pointF3.y);
            path4.lineTo(pointF7.x, pointF7.y);
            path4.lineTo(pointF8.x, pointF8.y);
            path4.close();
            Path[] pathArr = this.i;
            pathArr[0] = path;
            pathArr[1] = path2;
            pathArr[2] = path3;
            pathArr[3] = path4;
            this.j = new Paint();
            this.j.setAntiAlias(true);
            this.j.setStyle(Paint.Style.FILL);
            this.j.setColor(this.b);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            Rect clipBounds = canvas.getClipBounds();
            Path path = new Path();
            path.addRoundRect(new RectF(clipBounds), this.c, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(clipBounds.left, clipBounds.top);
            for (int i = 0; i < 4; i++) {
                Shader shader = this.h[i];
                Path path2 = this.i[i];
                this.j.setShader(shader);
                canvas.drawPath(path2, this.j);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class BoxShadowOptions {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<IParser> f23524a;
        private int b;
        public float blur;
        public int color;
        public float hShadow;
        public boolean isInset;
        public float[] radii;
        public float spread;
        public PointF topLeft;
        public float vShadow;
        public int viewHeight;
        public int viewWidth;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes9.dex */
        public interface IParser {
            void parse(String str);
        }

        static {
            kge.a(836325763);
        }

        public static /* synthetic */ List a(BoxShadowOptions boxShadowOptions) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("caa87e53", new Object[]{boxShadowOptions}) : boxShadowOptions.f23524a;
        }

        public static /* synthetic */ int b(BoxShadowOptions boxShadowOptions) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec0a0a28", new Object[]{boxShadowOptions})).intValue() : boxShadowOptions.b;
        }

        private BoxShadowOptions(final WXSDKInstance wXSDKInstance, int i) {
            this.b = 750;
            this.blur = 0.0f;
            this.spread = 0.0f;
            this.radii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.color = -16777216;
            this.isInset = false;
            this.viewWidth = 0;
            this.viewHeight = 0;
            this.topLeft = null;
            if (this.b != 0) {
                this.b = i;
            }
            this.f23524a = new ArrayList();
            IParser iParser = new IParser() { // from class: com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.IParser
                public void parse(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        float floatValue = WXUtils.getFloat(str, Float.valueOf(0.0f)).floatValue();
                        BoxShadowOptions boxShadowOptions = BoxShadowOptions.this;
                        boxShadowOptions.spread = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, floatValue, BoxShadowOptions.b(boxShadowOptions));
                        WXLogUtils.w("BoxShadowUtil", "Experimental box-shadow attribute: spread");
                    }
                }
            };
            this.f23524a.add(new IParser() { // from class: com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.IParser
                public void parse(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        float floatValue = WXUtils.getFloat(str, Float.valueOf(0.0f)).floatValue();
                        BoxShadowOptions boxShadowOptions = BoxShadowOptions.this;
                        boxShadowOptions.blur = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, floatValue, BoxShadowOptions.b(boxShadowOptions));
                    }
                }
            });
            this.f23524a.add(iParser);
        }

        public BoxShadowOptions scale(WXSDKInstance wXSDKInstance, float f) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (BoxShadowOptions) ipChange.ipc$dispatch("c6b0745f", new Object[]{this, wXSDKInstance, new Float(f)});
            }
            if (f <= 0.0f || f > 1.0f) {
                return null;
            }
            BoxShadowOptions boxShadowOptions = new BoxShadowOptions(wXSDKInstance, this.b);
            boxShadowOptions.hShadow = this.hShadow * f;
            boxShadowOptions.vShadow = this.vShadow * f;
            boxShadowOptions.blur = this.blur * f;
            boxShadowOptions.spread = this.spread * f;
            while (true) {
                float[] fArr = this.radii;
                if (i >= fArr.length) {
                    break;
                }
                boxShadowOptions.radii[i] = fArr[i] * f;
                i++;
            }
            boxShadowOptions.viewHeight = (int) (this.viewHeight * f);
            boxShadowOptions.viewWidth = (int) (this.viewWidth * f);
            if (this.topLeft != null) {
                boxShadowOptions.topLeft = new PointF();
                boxShadowOptions.topLeft.x = this.topLeft.x * f;
                boxShadowOptions.topLeft.y = this.topLeft.y * f;
            }
            boxShadowOptions.color = this.color;
            boxShadowOptions.isInset = this.isInset;
            WXLogUtils.d("BoxShadowUtil", "Scaled BoxShadowOptions: [" + f + "] " + boxShadowOptions);
            return boxShadowOptions;
        }

        public Rect getTargetCanvasRect() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("2b605413", new Object[]{this}) : new Rect(0, 0, this.viewWidth + (((int) (this.blur + this.spread + Math.abs(this.hShadow))) * 2), this.viewHeight + (((int) (this.blur + this.spread + Math.abs(this.vShadow))) * 2));
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuffer stringBuffer = new StringBuffer("BoxShadowOptions{");
            stringBuffer.append("h-shadow=");
            stringBuffer.append(this.hShadow);
            stringBuffer.append(", v-shadow=");
            stringBuffer.append(this.vShadow);
            stringBuffer.append(", blur=");
            stringBuffer.append(this.blur);
            stringBuffer.append(", spread=");
            stringBuffer.append(this.spread);
            stringBuffer.append(", corner-radius=");
            stringBuffer.append(riy.ARRAY_START_STR + this.radii[0] + "," + this.radii[2] + "," + this.radii[4] + "," + this.radii[6] + riy.ARRAY_END_STR);
            stringBuffer.append(", color=#");
            stringBuffer.append(Integer.toHexString(this.color));
            stringBuffer.append(", inset=");
            stringBuffer.append(this.isInset);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }
}
