package com.etao.feimagesearch.regionedit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.taobao.android.searchbaseframe.util.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.com;
import tb.crr;
import tb.crs;
import tb.cry;
import tb.crz;
import tb.csc;
import tb.csh;
import tb.csk;
import tb.kge;
import tb.rwf;

/* loaded from: classes3.dex */
public final class RegionEditView2023 extends FrameLayout implements com.etao.feimagesearch.regionedit.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap bitmap;
    private int currState;
    private final SparseArray<cry> fingerArray;
    private final ImageView imageView;
    private boolean isHidePreviewImgView;
    private boolean isTouchEnabled;
    private int lastState;
    private final MaskView maskView;
    private Rect previewImgLocationRect;
    private com.etao.feimagesearch.newresult.widget.preview.b regionCallback;
    private int regionCount;
    private a regionEditViewChangeListener;
    private float regionImgDragBottomEdgeHeight;
    private float regionImgDragTopEdgeHeight;
    private List<g> regionParts;
    private e selectedObject;
    private e selfDefinedObject;
    private final List<e> totalObjects;
    private final List<crz> touchHelpers;
    private final SparseArray<crz> touchRegistry;
    private final int touchSlop;

    /* loaded from: classes3.dex */
    public interface a {
        void a(float f);

        void b(float f);

        void c(float f);
    }

    static {
        kge.a(-1671563804);
        kge.a(-1591020106);
    }

    public static /* synthetic */ Object ipc$super(RegionEditView2023 regionEditView2023, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionEditView2023(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
        this.regionImgDragTopEdgeHeight = j.b(50.0f);
        this.fingerArray = new SparseArray<>(2);
        this.touchRegistry = new SparseArray<>();
        this.touchHelpers = new ArrayList();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        q.a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        this.imageView = new ImageView(context);
        this.maskView = new MaskView(context);
        this.totalObjects = new ArrayList();
        this.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.imageView.setPivotX(0.0f);
        this.imageView.setPivotY(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.gravity = 17;
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        addView(this.imageView, layoutParams2);
        addView(this.maskView, layoutParams2);
        this.maskView.setImageView(this.imageView);
        this.isTouchEnabled = true;
    }

    public final com.etao.feimagesearch.newresult.widget.preview.b getRegionCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.newresult.widget.preview.b) ipChange.ipc$dispatch("35956bd6", new Object[]{this}) : this.regionCallback;
    }

    public final void setRegionCallback(com.etao.feimagesearch.newresult.widget.preview.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a5ae6e", new Object[]{this, bVar});
        } else {
            this.regionCallback = bVar;
        }
    }

    public final a getRegionEditViewChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1ee6c0", new Object[]{this}) : this.regionEditViewChangeListener;
    }

    public final void setRegionEditViewChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb86043e", new Object[]{this, aVar});
        } else {
            this.regionEditViewChangeListener = aVar;
        }
    }

    private final void initTouchHelpers(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d5387c", new Object[]{this, f});
            return;
        }
        this.regionImgDragBottomEdgeHeight = f != null ? f.floatValue() : 0.0f;
        addTouchHelper(5, new crr(this.regionCallback));
        addTouchHelper(6, new crs(this.regionCallback));
        addTouchHelper(4, new csh(this.regionCallback));
        if (!this.isTouchEnabled) {
            return;
        }
        addTouchHelper(2, new csc(this.regionCallback));
        addTouchHelper(3, new csk(this.regionCallback));
    }

    private final void addTouchHelper(int i, crz crzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec062f15", new Object[]{this, new Integer(i), crzVar});
            return;
        }
        this.touchHelpers.add(crzVar);
        this.touchRegistry.put(i, crzVar);
        crzVar.a(this);
    }

    private final void updateRegions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb96c7d", new Object[]{this});
            return;
        }
        for (e eVar : this.totalObjects) {
            eVar.e();
        }
    }

    public final void setObjects(List<a.b> list, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55205c4f", new Object[]{this, list, f});
            return;
        }
        this.regionCount = list != null ? list.size() : 0;
        this.regionParts = new ArrayList(this.regionCount);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                List<g> list2 = this.regionParts;
                if (list2 == null) {
                    q.a();
                }
                list2.add(new g(i == 0, list.get(i)));
                i++;
            }
        }
        generateObjectDraw();
        initTouchHelpers(f);
    }

    private final void generateObjectDraw() {
        List<g> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03178ff", new Object[]{this});
        } else if (this.imageView.getWidth() != 0 && (list = this.regionParts) != null) {
            if (list.isEmpty()) {
                updateRegions();
                return;
            }
            this.totalObjects.clear();
            ArrayList arrayList = new ArrayList(list.size());
            for (g gVar : list) {
                e eVar = new e(gVar.b());
                RectF rectF = gVar.b().c;
                q.a((Object) rectF, "part.bean.region");
                eVar.a(rectF);
                eVar.a(gVar.a(), true);
                eVar.g();
                arrayList.add(eVar);
                this.totalObjects.add(eVar);
                if (gVar.a()) {
                    this.selectedObject = eVar;
                }
            }
            e eVar2 = new e(null);
            eVar2.a(new RectF());
            eVar2.a(false);
            eVar2.g();
            arrayList.add(eVar2);
            this.totalObjects.add(eVar2);
            this.selfDefinedObject = eVar2;
            list.clear();
            this.maskView.setParts(arrayList);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.previewImgLocationRect;
        if (rect != null) {
            this.imageView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        generateObjectDraw();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int width;
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Rect rect = this.previewImgLocationRect;
        if (rect == null) {
            width = getImageMeasureWidth(size);
            height = getImageMeasureHeight(size2);
        } else {
            if (rect == null) {
                q.a();
            }
            width = rect.width();
            Rect rect2 = this.previewImgLocationRect;
            if (rect2 == null) {
                q.a();
            }
            height = rect2.height();
        }
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        int c = rwf.c(width, size);
        int c2 = rwf.c(height, size2);
        this.maskView.measure(View.MeasureSpec.makeMeasureSpec(c, 1073741824), View.MeasureSpec.makeMeasureSpec(c2, 1073741824));
        setMeasuredDimension(c, c2);
    }

    public final void updateRegionImgDragBottomHeight(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f489a6", new Object[]{this, f});
        } else {
            this.regionImgDragBottomEdgeHeight = f != null ? f.floatValue() : 0.0f;
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
            return;
        }
        this.bitmap = bitmap;
        this.imageView.setImageBitmap(bitmap);
        if (!this.isHidePreviewImgView) {
            return;
        }
        this.imageView.setVisibility(4);
    }

    public final void setRegionAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6251cc11", new Object[]{this, new Float(f)});
        } else {
            this.maskView.setAlpha(f);
        }
    }

    private final void recordPointer(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32907b88", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        cry cryVar = this.fingerArray.get(motionEvent.getPointerId(i));
                        if (cryVar != null) {
                            cryVar.a(motionEvent, i);
                        }
                    }
                    return;
                } else if (actionMasked == 3) {
                    this.fingerArray.clear();
                    return;
                } else if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                }
            }
            this.fingerArray.remove(pointerId);
            return;
        }
        this.fingerArray.put(pointerId, new cry(motionEvent, actionIndex));
    }

    private final boolean floatEquals(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7255b7c6", new Object[]{this, new Float(f), new Float(f2)})).booleanValue() : Math.abs(f - f2) <= 1.0E-5f;
    }

    public final void setRegionSelected(RectF region) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c4f9c9", new Object[]{this, region});
            return;
        }
        q.c(region, "region");
        for (e eVar : this.totalObjects) {
            RectF f = eVar.f();
            if (floatEquals(region.left, f.left) && floatEquals(region.top, f.top) && floatEquals(region.right, f.right) && floatEquals(region.bottom, f.bottom)) {
                setSelectedObject(eVar);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null || this.selectedObject == null || isAnimating() || this.selfDefinedObject == null) {
            return false;
        }
        recordPointer(motionEvent);
        if (resetIfEmpty()) {
            return true;
        }
        if (this.currState == 0) {
            if (this.fingerArray.get(0) == null) {
                return true;
            }
            this.currState = 1;
        }
        if (this.currState == 1) {
            Iterator<crz> it = this.touchHelpers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                crz next = it.next();
                SparseArray<cry> sparseArray = this.fingerArray;
                e eVar = this.selectedObject;
                if (eVar == null) {
                    q.a();
                }
                List<e> list = this.totalObjects;
                e eVar2 = this.selfDefinedObject;
                if (eVar2 == null) {
                    q.a();
                }
                if (next.a(sparseArray, eVar, list, eVar2)) {
                    this.currState = next.a();
                    break;
                }
            }
        }
        crz crzVar = this.touchRegistry.get(this.currState);
        if (crzVar != null) {
            SparseArray<cry> sparseArray2 = this.fingerArray;
            e eVar3 = this.selectedObject;
            if (eVar3 == null) {
                q.a();
            }
            List<e> list2 = this.totalObjects;
            e eVar4 = this.selfDefinedObject;
            if (eVar4 == null) {
                q.a();
            }
            if (!crzVar.b(sparseArray2, eVar3, list2, eVar4)) {
                this.currState = 1;
            }
            e eVar5 = this.selectedObject;
            if (eVar5 == null) {
                q.a();
            }
            eVar5.e();
        }
        return true;
    }

    private final boolean isAnimating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        for (e eVar : this.totalObjects) {
            if (eVar.h()) {
                return true;
            }
        }
        for (crz crzVar : this.touchHelpers) {
            if (crzVar.b()) {
                return true;
            }
        }
        return false;
    }

    private final boolean resetIfEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e08e91ec", new Object[]{this})).booleanValue();
        }
        if (this.fingerArray.size() != 0) {
            return false;
        }
        this.lastState = this.currState;
        this.currState = 0;
        onTouchRelease();
        return true;
    }

    private final void onTouchRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581204e", new Object[]{this});
            return;
        }
        crz crzVar = this.touchRegistry.get(this.lastState);
        e eVar = this.selfDefinedObject;
        if (eVar == null || crzVar == null) {
            return;
        }
        e eVar2 = this.selectedObject;
        if (eVar2 == null) {
            q.a();
        }
        crzVar.a(eVar2, this.totalObjects, eVar);
    }

    private final void setImageViewScale(ImageView imageView, float f, PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b0bf54", new Object[]{this, imageView, new Float(f), pointF});
            return;
        }
        imageView.setScaleX(f);
        imageView.setScaleY(f);
        imageView.setPivotX(pointF.x);
        imageView.setPivotY(pointF.y);
    }

    private final void setViewScale(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51cc7a98", new Object[]{this, view, new Float(f)});
            return;
        }
        view.setScaleX(f);
        view.setScaleY(f);
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public void setImageTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9bf7f99", new Object[]{this, new Float(f)});
            return;
        }
        this.maskView.setTranslationX(f);
        this.imageView.setTranslationX(f);
        a aVar = this.regionEditViewChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.a(f);
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public void setImageTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb745838", new Object[]{this, new Float(f)});
            return;
        }
        this.maskView.setTranslationY(f);
        this.imageView.setTranslationY(f);
        a aVar = this.regionEditViewChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.b(f);
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public View getImageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("19152173", new Object[]{this}) : this.imageView;
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public void setImageScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eade408", new Object[]{this, new Float(f)});
            return;
        }
        setViewScale(this.imageView, f);
        setViewScale(this.maskView, f);
        a aVar = this.regionEditViewChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.c(f);
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public int getTouchSlop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa4b321d", new Object[]{this})).intValue() : this.touchSlop;
    }

    public void setSelectedObject(e selectedObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e5803b", new Object[]{this, selectedObject});
            return;
        }
        q.c(selectedObject, "selectedObject");
        if (q.a(selectedObject, this.selectedObject)) {
            return;
        }
        e eVar = this.selectedObject;
        if (eVar != null) {
            eVar.a(false, true);
        }
        this.selectedObject = selectedObject;
        e eVar2 = this.selectedObject;
        if (eVar2 == null) {
            q.a();
        }
        eVar2.a(true, true);
        this.maskView.invalidate();
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public View getHolderView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("94b05030", new Object[]{this}) : this;
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public float getDragTopEdgeLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec9597ea", new Object[]{this})).floatValue() : this.regionImgDragTopEdgeHeight;
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public float getDragBottomEdgeLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43dc7300", new Object[]{this})).floatValue() : this.regionImgDragBottomEdgeHeight;
    }

    @Override // com.etao.feimagesearch.regionedit.a
    public void setSelfDefinedSelected() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ad289d", new Object[]{this});
            return;
        }
        e eVar2 = this.selfDefinedObject;
        if (eVar2 == null || (eVar = this.selectedObject) == null) {
            return;
        }
        eVar2.a(eVar.f());
        eVar.d();
        eVar.a(false, false);
        eVar2.a(true, false);
        this.selectedObject = eVar2;
        eVar2.a(true);
        eVar2.e();
    }

    public final int getRegionCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("71d6133f", new Object[]{this})).intValue() : this.regionCount;
    }

    public final void assignPreviewImgLocation(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a65fd3", new Object[]{this, rect});
        } else if (rect == null) {
        } else {
            this.previewImgLocationRect = rect;
        }
    }

    public final void optionRegionTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b7b3f7", new Object[]{this, new Boolean(z)});
        } else {
            this.isTouchEnabled = z;
        }
    }

    public final void triggerPreviewImgViewHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f16ace1", new Object[]{this});
            return;
        }
        this.isHidePreviewImgView = true;
        this.maskView.triggerMainMaskViewFullOfParent();
    }

    private final int getImageMeasureWidth(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3a7022", new Object[]{this, new Integer(i)})).intValue() : this.bitmap == null ? i : com.b(getContext());
    }

    private final int getImageMeasureHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72776cf", new Object[]{this, new Integer(i)})).intValue();
        }
        Bitmap bitmap = this.bitmap;
        return bitmap == null ? i : (int) (bitmap.getHeight() * (com.b(getContext()) / bitmap.getWidth()));
    }
}
