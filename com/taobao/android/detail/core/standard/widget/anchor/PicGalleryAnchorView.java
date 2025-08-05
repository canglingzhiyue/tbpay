package com.taobao.android.detail.core.standard.widget.anchor;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.anchor.AbsPicGalleryAnchorContainerLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.arc;
import tb.ard;
import tb.emb;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryAnchorView extends LinearLayout implements AbsPicGalleryAnchorContainerLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private a mAnchorListener;
    private PicGalleryFixedAnchorContainerLayout mFixedAnchorContainer;
    private final List<b> mFixedAnchorModels;
    private PicGalleryScrollAnchorContainerLayout mScrollAnchorContainer;
    private PicGalleryAnchorIndicatorView mScrollAnchorIndicator;
    private final List<b> mScrollAnchorModels;
    private PicGalleryHorizontalScrollView mScrollAnchorWrapperContainer;
    private c mStyleConfig;

    static {
        kge.a(450078046);
        kge.a(-678224037);
    }

    public static /* synthetic */ Object ipc$super(PicGalleryAnchorView picGalleryAnchorView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PicGalleryAnchorView(Context context) {
        this(context, null);
    }

    public PicGalleryAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PicGalleryAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "PicGalleryAnchorView";
        this.mScrollAnchorModels = new ArrayList();
        this.mFixedAnchorModels = new ArrayList();
        setOrientation(0);
        initViews(context);
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorView");
    }

    public void setAnchorListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bf342a", new Object[]{this, aVar});
        } else {
            this.mAnchorListener = aVar;
        }
    }

    private void initViews(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cbdea3", new Object[]{this, context});
            return;
        }
        View inflate = inflate(context, R.layout.pic_gallery_anchor_view, this);
        this.mScrollAnchorWrapperContainer = (PicGalleryHorizontalScrollView) inflate.findViewById(R.id.pic_gallery_scroll_anchor_wrapper_container);
        this.mScrollAnchorIndicator = (PicGalleryAnchorIndicatorView) inflate.findViewById(R.id.pic_gallery_scroll_anchor_indicator);
        this.mScrollAnchorContainer = (PicGalleryScrollAnchorContainerLayout) inflate.findViewById(R.id.pic_gallery_scroll_anchor_container);
        this.mScrollAnchorContainer.setAnchorListener(this);
        this.mFixedAnchorContainer = (PicGalleryFixedAnchorContainerLayout) inflate.findViewById(R.id.pic_gallery_fixed_anchor_container);
        this.mFixedAnchorContainer.setAnchorListener(this);
    }

    public void bindData(c cVar, List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deeccd5d", new Object[]{this, cVar, list});
            return;
        }
        this.mStyleConfig = cVar;
        updateAnchorModels(list);
        updateAnchorLayout(cVar);
        updateLimitInitWidth(cVar, this.mScrollAnchorModels);
        this.mScrollAnchorContainer.updateAnchors(cVar, this.mScrollAnchorModels);
        this.mFixedAnchorContainer.updateAnchors(cVar, this.mFixedAnchorModels);
        updateAnchorIndicatorView(cVar, this.mScrollAnchorModels);
        initSelectAnchor(this.mScrollAnchorModels);
    }

    public String getSelectedAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebd26fb8", new Object[]{this});
        }
        b lastSelectedScrollAnchorModel = this.mScrollAnchorContainer.getLastSelectedScrollAnchorModel();
        if (lastSelectedScrollAnchorModel != null) {
            return lastSelectedScrollAnchorModel.b();
        }
        return null;
    }

    public void selectAnchor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20bf0ea2", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || this.mScrollAnchorModels.isEmpty()) {
        } else {
            b anchorModel = getAnchorModel(str);
            if (anchorModel == null) {
                anchorModel = getAnchorModel(this.mScrollAnchorModels.get(0).b());
            }
            selectAnchor(anchorModel, false);
        }
    }

    private void selectAnchor(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9670a031", new Object[]{this, bVar, new Boolean(z)});
        } else if (bVar == null) {
            arc.a().c("PicGalleryAnchorView", "selectAnchor", "anchorModel is null");
        } else {
            this.mScrollAnchorContainer.selectAnchor(this.mStyleConfig, bVar);
            offsetScrollAnchorLayoutAndIndicator(bVar);
            a aVar = this.mAnchorListener;
            if (aVar == null) {
                return;
            }
            aVar.a(bVar, z);
        }
    }

    private void updateAnchorLayout(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8e7eb", new Object[]{this, cVar});
        } else {
            setBackgroundDrawable(getDrawableWithColor(cVar.g(), emb.a(cVar.i(), -7829368)));
        }
    }

    private void updateAnchorIndicatorView(c cVar, List<b> list) {
        float measureTextWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d756fe2e", new Object[]{this, cVar, list});
            return;
        }
        int i = -1;
        this.mScrollAnchorIndicator.updateIndicatorColor(emb.a(this.mStyleConfig.f(), -1));
        this.mScrollAnchorIndicator.updateIndicatorStyle(this.mStyleConfig.j());
        for (b bVar : list) {
            if (!bVar.c()) {
                String selectedAnchorId = getSelectedAnchorId();
                if (selectedAnchorId == null) {
                    measureTextWidth = measureTextWidth(bVar.a(), cVar.b());
                } else if (selectedAnchorId.equalsIgnoreCase(bVar.b())) {
                    measureTextWidth = measureTextWidth(bVar.a(), cVar.b());
                }
                i = (int) measureTextWidth;
                break;
            }
        }
        if (i <= 0) {
            return;
        }
        this.mScrollAnchorIndicator.initAnchorSize(i + (cVar.e() * 2), cVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initSelectAnchor(java.util.List<com.taobao.android.detail.core.standard.widget.anchor.b> r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            java.lang.String r6 = "dc1cf0f9"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            r0 = 0
            java.lang.String r1 = r5.getSelectedAnchorId()
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r6.next()
            com.taobao.android.detail.core.standard.widget.anchor.b r3 = (com.taobao.android.detail.core.standard.widget.anchor.b) r3
            if (r1 != 0) goto L2d
            goto L37
        L2d:
            java.lang.String r4 = r3.b()
            boolean r4 = r1.equalsIgnoreCase(r4)
            if (r4 == 0) goto L1e
        L37:
            r0 = r3
        L38:
            r5.selectAnchor(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorView.initSelectAnchor(java.util.List):void");
    }

    private void updateLimitInitWidth(c cVar, List<b> list) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433c67c0", new Object[]{this, cVar, list});
            return;
        }
        int h = cVar.h();
        int size = list.size();
        int min = Math.min(size, h);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = (int) (i + measureTextWidth(list.get(i2).a(), cVar.b()));
        }
        int e = cVar.e();
        int i3 = i + (min * 2 * e);
        if (h < size && (bVar = list.get(min)) != null) {
            i3 = (int) (i3 + (measureTextWidth(bVar.a(), cVar.b()) / 2.0f) + e);
        }
        int k = cVar.k();
        if (-1 != k && k > 0) {
            i3 = Math.min(i3, k);
        }
        int a2 = cVar.a();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = a2;
        setLayoutParams(layoutParams);
    }

    private void updateAnchorModels(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596dc460", new Object[]{this, list});
            return;
        }
        this.mFixedAnchorModels.clear();
        this.mScrollAnchorModels.clear();
        for (b bVar : list) {
            if (b.a(bVar)) {
                if (bVar.c()) {
                    this.mFixedAnchorModels.add(bVar);
                } else {
                    this.mScrollAnchorModels.add(bVar);
                }
            }
        }
    }

    private b getAnchorModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ffe9fa1a", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        for (b bVar : this.mScrollAnchorModels) {
            if (str.equalsIgnoreCase(bVar.b())) {
                return bVar;
            }
        }
        return null;
    }

    private b getAnchorModelOfAnchorView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c89d3747", new Object[]{this, view}) : (b) view.getTag(R.id.standard_detail_gallery_tag_gallery_anchor_view_model);
    }

    private void offsetScrollAnchorLayoutAndIndicator(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e6805d", new Object[]{this, bVar});
            return;
        }
        View scrollAnchorView = getScrollAnchorView(bVar);
        if (scrollAnchorView == null) {
            ard a2 = arc.a();
            a2.c("PicGalleryAnchorView", "offsetScrollAnchorLayoutAndIndicator", "找不到对应的selectedView,selectedAnchorModel=" + bVar);
            return;
        }
        int calScrollAnchorContainerScrollByX = calScrollAnchorContainerScrollByX(scrollAnchorView);
        offsetScrollAnchorIndicator(scrollAnchorView, calScrollAnchorContainerScrollByX);
        this.mScrollAnchorContainer.moveSelectedAnchorToCenter(calScrollAnchorContainerScrollByX);
    }

    private void offsetScrollAnchorIndicator(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9db2af2", new Object[]{this, view, new Integer(i)});
        } else {
            this.mScrollAnchorIndicator.onSelectedAnchor(view.getWidth(), view.getLeft() + i + this.mScrollAnchorContainer.getLeft());
        }
    }

    private int calScrollAnchorContainerScrollByX(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d6013b", new Object[]{this, view})).intValue();
        }
        int width = this.mScrollAnchorWrapperContainer.getWidth();
        int left = view.getLeft();
        int width2 = view.getWidth();
        int left2 = this.mScrollAnchorContainer.getLeft();
        int abs = Math.abs(this.mScrollAnchorContainer.getWidth() - width);
        int abs2 = Math.abs(left + (width2 / 2));
        int i = -abs;
        int i2 = ((width / 2) - left2) - abs2;
        int i3 = left2 + i2;
        return i3 < i ? i - left2 : i3 > 0 ? 0 - left2 : i2;
    }

    private View getScrollAnchorView(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ea2c48b9", new Object[]{this, bVar});
        }
        if (bVar == null) {
            arc.a().c("PicGalleryAnchorView", "getScrollAnchorView", "anchorModel is null");
            return null;
        }
        String b = bVar.b();
        if (b == null) {
            ard a2 = arc.a();
            a2.c("PicGalleryAnchorView", "getScrollAnchorView", "anchorId is null,anchorModel=" + bVar);
            return null;
        }
        int childCount = this.mScrollAnchorContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mScrollAnchorContainer.getChildAt(i);
            b anchorModelOfAnchorView = getAnchorModelOfAnchorView(childAt);
            if (anchorModelOfAnchorView != null && b.equalsIgnoreCase(anchorModelOfAnchorView.b())) {
                return childAt;
            }
        }
        ard a3 = arc.a();
        a3.c("PicGalleryAnchorView", "getScrollAnchorView", "cannot find anchor view for anchorModel=" + bVar);
        return null;
    }

    private Drawable getDrawableWithColor(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("da141cca", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Drawable drawable = getResources().getDrawable(i);
        drawable.setColorFilter(i2, PorterDuff.Mode.DST);
        return drawable;
    }

    private float measureTextWidth(String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db5fe804", new Object[]{this, str, new Float(f)})).floatValue() : this.mScrollAnchorContainer.measureTextWidth(str, f);
    }

    @Override // com.taobao.android.detail.core.standard.widget.anchor.AbsPicGalleryAnchorContainerLayout.a
    public void onAnchorClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc5f9f7", new Object[]{this, view});
        } else {
            selectAnchor(getAnchorModelOfAnchorView(view), true);
        }
    }
}
