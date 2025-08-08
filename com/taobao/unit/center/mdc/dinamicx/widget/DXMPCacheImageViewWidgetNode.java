package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.phenix.cache.memory.e;
import com.taobao.phenix.cache.memory.f;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.c;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.kge;

/* loaded from: classes9.dex */
public class DXMPCacheImageViewWidgetNode extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMPCACHEIMAGEVIEW_CACHEGROUP = 6117402302357436939L;
    public static final long DXMPCACHEIMAGEVIEW_MPCACHEIMAGEVIEW = 4919702779544933119L;
    public static boolean isSmallPicture;
    private static final LruCache<String, Bitmap> sCacheBitMap;
    private String cacheGroup;

    public static /* synthetic */ Object ipc$super(DXMPCacheImageViewWidgetNode dXMPCacheImageViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 28626114:
                super.onEndParser();
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ String access$000(DXMPCacheImageViewWidgetNode dXMPCacheImageViewWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5fe1db", new Object[]{dXMPCacheImageViewWidgetNode}) : dXMPCacheImageViewWidgetNode.cacheGroup;
    }

    public static /* synthetic */ LruCache access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("5fdbf769", new Object[0]) : sCacheBitMap;
    }

    static {
        kge.a(462530981);
        sCacheBitMap = new LruCache<>(20);
        isSmallPicture = !ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "closeMsgCacheImageViewWidget");
    }

    /* loaded from: classes9.dex */
    public static class Builder implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-996471940);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMPCacheImageViewWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMPCacheImageViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXMPCacheImageViewWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.cacheGroup = ((DXMPCacheImageViewWidgetNode) dXWidgetNode).cacheGroup;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        ImageView imageView = (ImageView) view;
        Bitmap bitmap = sCacheBitMap.get(getImageUrl());
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else {
            super.onEndParser();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e57e52", new Object[]{this, new Boolean(z)});
        } else {
            super.onEndParser();
        }
    }

    public static c preFetchHeadImage(String str, a<SuccPhenixEvent> aVar, a<FailPhenixEvent> aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5a05b95b", new Object[]{str, aVar, aVar2});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (isSmallPicture) {
            str = ImageStrategyDecider.decideUrl(str, 120, 120, null);
        }
        PhenixCreator schedulePriority = b.h().a("wangxin-chat", str).memoryCachePriority(34).diskCachePriority(34).schedulePriority(3);
        if (isSmallPicture) {
            schedulePriority.limitSize(null, 120, 120);
        }
        if (aVar != null) {
            schedulePriority.succListener(aVar);
        }
        if (aVar2 != null) {
            schedulePriority.failListener(aVar2);
        }
        return schedulePriority.fetch();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXMPCACHEIMAGEVIEW_CACHEGROUP) {
            this.cacheGroup = str;
        } else {
            if (3520785955321526846L == j && sCacheBitMap.get(str) == null) {
                preFetchHeadImage(str, new a<SuccPhenixEvent>() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMPCacheImageViewWidgetNode.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent.getDrawable() instanceof f) {
                            f fVar = (f) succPhenixEvent.getDrawable();
                            fVar.a();
                            if (StringUtils.isEmpty(DXMPCacheImageViewWidgetNode.access$000(DXMPCacheImageViewWidgetNode.this))) {
                                DXMPCacheImageViewWidgetNode.access$100().put(str, fVar.getBitmap());
                            }
                        } else if ((succPhenixEvent.getDrawable() instanceof e) && StringUtils.isEmpty(DXMPCacheImageViewWidgetNode.access$000(DXMPCacheImageViewWidgetNode.this))) {
                            DXMPCacheImageViewWidgetNode.access$100().put(str, succPhenixEvent.getDrawable().getBitmap());
                        }
                        return false;
                    }
                }, null);
            }
            super.onSetStringAttribute(j, str);
        }
    }
}
