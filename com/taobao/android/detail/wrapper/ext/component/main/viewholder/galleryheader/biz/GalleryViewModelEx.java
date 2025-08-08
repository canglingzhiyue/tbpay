package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.event.basic.n;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.event.video.GallerySourceType;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.GalleryRecyclerView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.BounceImageModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.GalleryVideoModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.NormalImageModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.VideoModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.view.TouchImageView;
import com.taobao.android.detail.wrapper.ext.request.collection.CollocationRequestClient;
import com.taobao.android.detail.wrapper.ext.request.collection.CollocationRequestParams;
import com.taobao.android.detail.wrapper.ext.uikit.SkuBar;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.c;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.j;
import com.taobao.avplayer.DWInstance;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dzh;
import tb.edp;
import tb.ehs;
import tb.emh;
import tb.emu;
import tb.eno;
import tb.enp;
import tb.epj;
import tb.epo;
import tb.epq;
import tb.eqb;
import tb.fpz;
import tb.kge;
import tb.rgu;
import tb.rgw;
import tb.rgy;

/* loaded from: classes5.dex */
public class GalleryViewModelEx extends MultiMediaViewModel implements d.b, j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ORDERED_DOWN = 2;
    private static final int ORDERED_UP = 1;
    private static String VESSEL_METHOD_MAP_KEY;
    private static String VESSEL_METHOD_NAME_GET_NODE_BUNDLE;
    private final int BLACKLIGHT_START;
    private final int BLACKLIGHT_STOP;
    private Date end;
    public RecyclerViewPager.a galleryOnPageChangedListener;
    private b galleryUtils;
    public int historyY;
    private boolean isCollocateWeexLoaded;
    private a layoutManager;
    private LinearLayoutManager linearLayoutManager;
    private DetailImageView mAivTimeTunnel;
    private long mBlacklightDuration;
    private String mCollorateWeexUrl;
    private int mContainerHeight;
    private GestureDetector mGestureDetector;
    private int mInsertIndex;
    private boolean mNeedToJumpBackToLast;
    private List<GalleryVideoModel> mVideoModelCache;
    private RecyclerViewPager.a pageChangedListenerForSize;
    private long shakeCount;
    private Date start;
    public float transparency;

    public static /* synthetic */ Object ipc$super(GalleryViewModelEx galleryViewModelEx, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2061068867:
                return super.getViewHolder();
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -537482664:
                super.onBindViewHolder((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 20217053:
                super.bindModel((SubItemModel) objArr[0]);
                return null;
            case 1192889117:
                super.render();
                return null;
            case 1219488126:
                super.reRenderViewHolder((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) objArr[0]);
                return null;
            case 1838200670:
                super.onPause(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int access$002(GalleryViewModelEx galleryViewModelEx, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("288374ae", new Object[]{galleryViewModelEx, new Integer(i)})).intValue();
        }
        galleryViewModelEx.mCurrentImgIndex = i;
        return i;
    }

    public static /* synthetic */ int access$100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f70543a", new Object[]{galleryViewModelEx})).intValue() : galleryViewModelEx.mCurrentImgIndex;
    }

    public static /* synthetic */ TBMultiMediaModel access$1000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("659860d1", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ ArrayList access$10000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("5980dc61", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSubItemViewModels;
    }

    public static /* synthetic */ IndicatorBar access$10100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("267a0f72", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ void access$10200(GalleryViewModelEx galleryViewModelEx, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec46191a", new Object[]{galleryViewModelEx, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            galleryViewModelEx.jumpToVideoAnchor(i, z, z2);
        }
    }

    public static /* synthetic */ void access$10300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d40f18a", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.jumpToImageArea();
        }
    }

    public static /* synthetic */ TBMultiMediaModel access$10400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("f989b27", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$10500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("16ebf8a8", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ GalleryRecyclerView access$10600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GalleryRecyclerView) ipChange.ipc$dispatch("f05295c7", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mGalleyView;
    }

    public static /* synthetic */ IndicatorBar access$10700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("60c3d878", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$10800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("152579f9", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$10900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("c9871b7a", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$1100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("6cebbe52", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ IndicatorBar access$11000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("49eafc90", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$11100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("fe4c9e11", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$11200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("b2ae3f92", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ void access$11300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbc0729", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.judgeShowPicIndexOrNot();
        }
    }

    public static /* synthetic */ BlackLightIndicatorBar access$11400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlackLightIndicatorBar) ipChange.ipc$dispatch("340d8b3d", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mBlackLightIndicatorBar;
    }

    public static /* synthetic */ b access$11500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8a37be1c", new Object[]{galleryViewModelEx}) : galleryViewModelEx.galleryUtils;
    }

    public static /* synthetic */ TBMultiMediaModel access$11600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("157a8c8", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$11700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("8ab0649", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ ArrayList access$11800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b976c88", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSubItemViewModels;
    }

    public static /* synthetic */ ArrayList access$11900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ef565c89", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSubItemViewModels;
    }

    public static /* synthetic */ TBMultiMediaModel access$1200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("743f1bd3", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ GalleryRecyclerView access$12000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GalleryRecyclerView) ipChange.ipc$dispatch("3d2893ff", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mGalleyView;
    }

    public static /* synthetic */ TBMultiMediaModel access$12100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("bfcf27e2", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ GestureDetector access$12200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GestureDetector) ipChange.ipc$dispatch("7243ff79", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mGestureDetector;
    }

    public static /* synthetic */ int access$12302(GalleryViewModelEx galleryViewModelEx, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6310d1ec", new Object[]{galleryViewModelEx, new Integer(i)})).intValue();
        }
        galleryViewModelEx.mCurrentImgIndex = i;
        return i;
    }

    public static /* synthetic */ void access$12400(GalleryViewModelEx galleryViewModelEx, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd9493a", new Object[]{galleryViewModelEx, new Integer(i), new Boolean(z)});
        } else {
            galleryViewModelEx.jumpToVideoAnchor(i, z);
        }
    }

    public static /* synthetic */ IndicatorBar access$12500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("a7a5b2b4", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$12600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("5c075435", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$12700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("1068f5b6", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ BlackLightIndicatorBar access$12800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlackLightIndicatorBar) ipChange.ipc$dispatch("6dbb7020", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mBlackLightIndicatorBar;
    }

    public static /* synthetic */ BlackLightIndicatorBar access$12900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlackLightIndicatorBar) ipChange.ipc$dispatch("b885e461", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mBlackLightIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$1300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("7b927954", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ void access$13000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8d82e4", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.updateFloatState();
        }
    }

    public static /* synthetic */ Context access$13100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("218d7d5d", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$13200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("aa3ad802", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ void access$13300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb23267", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.updateFloatState();
        }
    }

    public static /* synthetic */ int access$13402(GalleryViewModelEx galleryViewModelEx, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("727385cc", new Object[]{galleryViewModelEx, new Integer(i)})).intValue();
        }
        galleryViewModelEx.mCurrentImgIndex = i;
        return i;
    }

    public static /* synthetic */ void access$13500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0caa769", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.updateFloatState();
        }
    }

    public static /* synthetic */ void access$13600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d6e1ea", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.jumpToRightVideoArea();
        }
    }

    public static /* synthetic */ BlackLightIndicatorBar access$13700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlackLightIndicatorBar) ipChange.ipc$dispatch("31750fbe", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mBlackLightIndicatorBar;
    }

    public static /* synthetic */ Context access$13800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6d60b1e4", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$13900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("dd826689", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$1400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("82e5d6d5", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$14000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("7eac6f9f", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ void access$14100(GalleryViewModelEx galleryViewModelEx, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73ed86c", new Object[]{galleryViewModelEx, jSONObject});
        } else {
            galleryViewModelEx.replaceCollocateData(jSONObject);
        }
    }

    public static /* synthetic */ void access$14200(GalleryViewModelEx galleryViewModelEx, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4723b20b", new Object[]{galleryViewModelEx, jSONObject});
        } else {
            galleryViewModelEx.saveCollocateData(jSONObject);
        }
    }

    public static /* synthetic */ void access$14300(GalleryViewModelEx galleryViewModelEx, Map map, com.taobao.vessel.base.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ddf2e05", new Object[]{galleryViewModelEx, map, aVar});
        } else {
            galleryViewModelEx.onVesselViewCallBackInvoked(map, aVar);
        }
    }

    public static /* synthetic */ VesselView access$14400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("9de4d53d", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mVesselView;
    }

    public static /* synthetic */ VesselView access$14500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("de3d565c", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mVesselView;
    }

    public static /* synthetic */ boolean access$14602(GalleryViewModelEx galleryViewModelEx, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2518f2d", new Object[]{galleryViewModelEx, new Boolean(z)})).booleanValue();
        }
        galleryViewModelEx.isWeexLoadSuccess = z;
        return z;
    }

    public static /* synthetic */ TBMultiMediaModel access$14700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("b1f3fe26", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$14800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("b9475ba7", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$14900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("c09ab928", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$1500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("8a393456", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ Context access$15000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b650471a", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ Context access$15100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c1254e9b", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$15200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("706b7d40", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$15300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("77bedac1", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$15400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("7f123842", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$15500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("866595c3", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ Context access$15600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f74e7420", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$15700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("950c50c5", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ DetailImageView access$15800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("eb80966d", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mAivTimeTunnel;
    }

    public static /* synthetic */ RelativeLayout access$15900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("c0221c7b", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContentView;
    }

    public static /* synthetic */ GalleryRecyclerView access$1600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GalleryRecyclerView) ipChange.ipc$dispatch("4669abf5", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mGalleyView;
    }

    public static /* synthetic */ RelativeLayout access$16000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("2bea1911", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContentView;
    }

    public static /* synthetic */ Context access$16100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("10f1373a", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$16200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("5383cfdf", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ boolean access$16300(GalleryViewModelEx galleryViewModelEx, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("144ba814", new Object[]{galleryViewModelEx, new Boolean(z)})).booleanValue() : galleryViewModelEx.popMultiMedia(z);
    }

    public static /* synthetic */ Context access$16400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("31704dbd", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$1700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("98dfef58", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ Context access$1800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("10f7bfb5", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$1900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("a786aa5a", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ int access$200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f07c8ebb", new Object[]{galleryViewModelEx})).intValue() : galleryViewModelEx.mShowIndex;
    }

    public static /* synthetic */ Context access$2000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a1b6c4c", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$2100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("500410f1", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ ArrayList access$2200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ae1b9b30", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSubItemViewModels;
    }

    public static /* synthetic */ TBMultiMediaModel access$2300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("5eaacbf3", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ Context access$2400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("356f8a50", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ Context access$2500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("404491d1", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ Context access$2600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4b199952", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ Context access$2700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("55eea0d3", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ TBMultiMediaModel access$2800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("834b9f78", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ Context access$2900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6b98afd5", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mContext;
    }

    public static /* synthetic */ boolean access$300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d188c94d", new Object[]{galleryViewModelEx})).booleanValue() : galleryViewModelEx.isCollocateWeexLoaded;
    }

    public static /* synthetic */ d access$3000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("59bb979b", new Object[]{galleryViewModelEx}) : galleryViewModelEx.getVideoViewModel();
    }

    public static /* synthetic */ IndicatorBar access$3100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("7356a05e", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ BlackLightIndicatorBar access$3200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlackLightIndicatorBar) ipChange.ipc$dispatch("6131e8c8", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mBlackLightIndicatorBar;
    }

    public static /* synthetic */ boolean access$3300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1608e7a", new Object[]{galleryViewModelEx})).booleanValue() : galleryViewModelEx.mNeedToJumpBackToLast;
    }

    public static /* synthetic */ boolean access$3302(GalleryViewModelEx galleryViewModelEx, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b515d5e0", new Object[]{galleryViewModelEx, new Boolean(z)})).booleanValue();
        }
        galleryViewModelEx.mNeedToJumpBackToLast = z;
        return z;
    }

    public static /* synthetic */ IndicatorBar access$3400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("907b84e1", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$3500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("44dd2662", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ BlackLightIndicatorBar access$3600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlackLightIndicatorBar) ipChange.ipc$dispatch("8c5bb9cc", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mBlackLightIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$3700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("ada06964", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$3800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("62020ae5", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ int access$3900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("47a9ed6f", new Object[]{galleryViewModelEx})).intValue() : galleryViewModelEx.getGalleryVideoIndex();
    }

    public static /* synthetic */ boolean access$400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b29503ce", new Object[]{galleryViewModelEx})).booleanValue() : galleryViewModelEx.enableCollorateConfig;
    }

    public static /* synthetic */ IndicatorBar access$4000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("96c78d7c", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$4100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("4b292efd", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ LinearLayout access$4200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("c8f3f4eb", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mDescEntrance;
    }

    public static /* synthetic */ IndicatorBar access$4300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("b3ec71ff", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ SkuBar access$4400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuBar) ipChange.ipc$dispatch("4d444677", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSkubar;
    }

    public static /* synthetic */ IndicatorBar access$4500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("1cafb501", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$4600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("3ad589b4", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$4700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("4228e735", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ IndicatorBar access$4800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("39d49984", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$4900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("50cfa237", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ void access$500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a13e4b", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.showCollocateFloat();
        }
    }

    public static /* synthetic */ IndicatorBar access$5000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("6e9a1c1b", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$5100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("22fbbd9c", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$5200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("a0664f", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$5300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("7f3c3d0", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ IndicatorBar access$5400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("4020a21f", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$5500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("f48243a0", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ SkuBar access$5600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuBar) ipChange.ipc$dispatch("48419236", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSkubar;
    }

    public static /* synthetic */ LinearLayout access$5700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("13ad510f", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mDescEntrance;
    }

    public static /* synthetic */ IndicatorBar access$5800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("11a72823", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$5900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("c608c9a4", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ void access$600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ad78cc", new Object[]{galleryViewModelEx});
        } else {
            galleryViewModelEx.updateFloatState();
        }
    }

    public static /* synthetic */ TBMultiMediaModel access$6000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("d511fdec", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$6100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("dc655b6d", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ IndicatorBar access$6200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("af2fedbc", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$6300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("eb0c166f", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ IndicatorBar access$6400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("17f330be", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$6500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("cc54d23f", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$6600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("80b673c0", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$6700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("8598c73", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ SkuBar access$6800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuBar) ipChange.ipc$dispatch("433eddf5", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSkubar;
    }

    public static /* synthetic */ LinearLayout access$6900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("582c9030", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mDescEntrance;
    }

    public static /* synthetic */ ArrayList access$700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("eaceeea7", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSubItemViewModels;
    }

    public static /* synthetic */ IndicatorBar access$7000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("1e3f3959", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ SkuBar access$7100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuBar) ipChange.ipc$dispatch("110e5add", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSkubar;
    }

    public static /* synthetic */ LinearLayout access$7200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("89fd7848", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mDescEntrance;
    }

    public static /* synthetic */ IndicatorBar access$7300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("3b641ddc", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ BlackLightIndicatorBar access$7400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlackLightIndicatorBar) ipChange.ipc$dispatch("30d720c6", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mBlackLightIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$7500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("dccb2410", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$7600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("e41e8191", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ IndicatorBar access$7700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("ceaa3e0", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$7800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("c14c4561", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$7900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("75ade6e2", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ ArrayList access$800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ce8ddea8", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSubItemViewModels;
    }

    public static /* synthetic */ IndicatorBar access$8000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("f611c7f8", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$8100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("aa736979", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ boolean access$8200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62bbc014", new Object[]{galleryViewModelEx})).booleanValue() : galleryViewModelEx.hasVideo();
    }

    public static /* synthetic */ IndicatorBar access$8300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("1336ac7b", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$8400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("c7984dfc", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TBMultiMediaModel access$8500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("bfe376af", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ boolean access$8600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6ecaa18", new Object[]{galleryViewModelEx})).booleanValue() : galleryViewModelEx.hasVideo();
    }

    public static /* synthetic */ boolean access$8700(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7f8e499", new Object[]{galleryViewModelEx})).booleanValue() : galleryViewModelEx.hasVideo();
    }

    public static /* synthetic */ TBMultiMediaModel access$8800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("d5dd8f32", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$8900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("dd30ecb3", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ TBMultiMediaModel access$900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("5998e36b", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ boolean access$9000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e11e60b1", new Object[]{galleryViewModelEx})).booleanValue() : galleryViewModelEx.hasRightVideo();
    }

    public static /* synthetic */ IndicatorBar access$9100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("8245f818", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ IndicatorBar access$9200(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorBar) ipChange.ipc$dispatch("36a79999", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mIndicatorBar;
    }

    public static /* synthetic */ TextView access$9300(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b22a28a4", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mNewIndicator;
    }

    public static /* synthetic */ int access$9400(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("654f4aa4", new Object[]{galleryViewModelEx})).intValue() : galleryViewModelEx.getChildrenSize();
    }

    public static /* synthetic */ TextView access$9500(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c7d437a6", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mNewIndicator;
    }

    public static /* synthetic */ TBMultiMediaModel access$9600(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("aa4f26cf", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ void access$9700(GalleryViewModelEx galleryViewModelEx, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bbf4f", new Object[]{galleryViewModelEx, new Integer(i)});
        } else {
            galleryViewModelEx.setTextToPicIndex(i);
        }
    }

    public static /* synthetic */ TBMultiMediaModel access$9800(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMultiMediaModel) ipChange.ipc$dispatch("b8f5e1d1", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mTBMultiMediaModel;
    }

    public static /* synthetic */ ArrayList access$9900(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("f52d9c10", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mSubItemViewModels;
    }

    static {
        kge.a(1858970080);
        kge.a(-1453870097);
        kge.a(-1167274459);
        VESSEL_METHOD_MAP_KEY = "method";
        VESSEL_METHOD_NAME_GET_NODE_BUNDLE = "get_detail_data";
    }

    private int getGalleryVideoIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f898b84d", new Object[]{this})).intValue();
        }
        if (this.enableCollorateConfig) {
            int max = Math.max(this.mTBMultiMediaModel.childModels.size() - 2, 0);
            if (!(this.mTBMultiMediaModel.childModels.get(max) instanceof GalleryVideoModel)) {
                return -10;
            }
            return max;
        }
        int size = this.mTBMultiMediaModel.childModels.size();
        for (int i = 0; i < size; i++) {
            if (this.mTBMultiMediaModel.childModels.get(i) instanceof GalleryVideoModel) {
                return i;
            }
        }
        return -10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel getVideoModel() {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r2 = "f5400e8b"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel r0 = (com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel) r0
            return r0
        L15:
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel r0 = r3.mTBMultiMediaModel
            java.util.ArrayList<com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel> r0 = r0.childModels
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel r1 = (com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel) r1
            boolean r2 = r1 instanceof com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.VideoModel
            if (r2 == 0) goto L2e
            return r1
        L2e:
            boolean r2 = r1 instanceof com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.GalleryVideoModel
            if (r2 == 0) goto L1d
            return r1
        L33:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.getVideoModel():com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel");
    }

    private com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b getGalleryVideoViewModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) ipChange.ipc$dispatch("66ab22f6", new Object[]{this});
        }
        if (this.mSubItemViewModels == null) {
            return null;
        }
        Iterator<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b next = it.next();
            if (next instanceof com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) {
                return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) next;
            }
        }
        return null;
    }

    private List<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b> getGalleryVideoViewModelNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("599cff25", new Object[]{this});
        }
        if (this.mSubItemViewModels == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b next = it.next();
            if (next instanceof com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) {
                arrayList.add((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) next);
            }
        }
        return arrayList;
    }

    private void resetGalleyViewSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9be599", new Object[]{this, new Integer(i)});
        } else if (this.mTBMultiMediaModel == null || this.mTBMultiMediaModel.childModels.isEmpty() || this.mTBMultiMediaModel.isPopupMode || (this.mTBMultiMediaModel.childModels.get(i) instanceof BounceImageModel)) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.mGalleyView.getLayoutParams();
            int e = this.galleryUtils.e(getVideoModel());
            if (layoutParams.height == e) {
                return;
            }
            layoutParams.height = e;
            this.mGalleyView.setLayoutParams(layoutParams);
        }
    }

    private void switchToPopupOrNotMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc425d7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mTBMultiMediaModel.isPopupMode = z;
        if (!this.enableCollorateConfig) {
            updateFloatState();
        }
        if (z) {
            this.mGalleyView.findViewById(R.id.img_gallery).setLayoutParams(this.RELATIVE_LAYOUT_MATCH_PARENT);
            this.mBlacklightClosed.setVisibility(0);
            removeGalleryVideo();
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.galleryUtils.e(this.mTBMultiMediaModel.childModels.get(0)));
            layoutParams.addRule(15);
            this.mGalleyView.setLayoutParams(layoutParams);
            this.mBlacklightClosed.setVisibility(8);
            addGalleryVideo();
        }
        if (this.mIndicatorBar != null) {
            this.mIndicatorBar.setIsPopupMode(z);
            if (z) {
                this.mIndicatorBar.setBottomMarginByPixel(epo.n);
                this.mIndicatorBar.setIndicatorVisibility(8);
                this.mBlackLightIndicatorBar.setVisibility(0);
            } else {
                this.mBlackLightIndicatorBar.setVisibility(8);
                this.mIndicatorBar.setIndicatorVisibility(0);
                autoFitIndicatorBarBottomMargin();
            }
            if (this.mTBMultiMediaModel != null && this.mTBMultiMediaModel.childModels != null) {
                this.mHandler.post(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        GalleryViewModelEx galleryViewModelEx = GalleryViewModelEx.this;
                        GalleryViewModelEx.access$9700(galleryViewModelEx, GalleryViewModelEx.access$9600(galleryViewModelEx).currentIndex);
                    }
                });
                judgeShowPicIndexOrNot();
                SubItemModel subItemModel = this.mTBMultiMediaModel.childModels.get(Math.max(this.mTBMultiMediaModel.currentIndex, 0));
                if (subItemModel != null && (subItemModel instanceof NormalImageModel)) {
                    NormalImageModel normalImageModel = (NormalImageModel) subItemModel;
                    if (normalImageModel.isSkuPic) {
                        if (z) {
                            this.mSkubar.setVisibility(4);
                            this.mSkubar.hide(null);
                            this.mDescEntrance.setVisibility(8);
                            this.mIndicatorBar.showPicDescText(normalImageModel.propRate.f9994a);
                        } else {
                            this.mSkubar.setVisibility(0);
                            this.mDescEntrance.setVisibility(0);
                            this.mSkubar.updateData(normalImageModel.propRate);
                            this.mIndicatorBar.hidePicDescText();
                            this.mIndicatorBar.hideGalleryLeftAndRightContainer();
                        }
                    }
                }
                this.mIndicatorBar.updateGalleryLeftContainerState(this.mTBMultiMediaModel.mOpenUrlGalleryItemNode);
                this.mIndicatorBar.updateGalleryRightContainerState(this.mTBMultiMediaModel.mVideoGalleryItemNode);
            }
        }
        render();
        if (this.mNewIndicator == null || !isNewIndicator()) {
            return;
        }
        if (z) {
            this.mNewIndicator.setVisibility(8);
            this.mIndicatorBar.setVisibility(0);
            return;
        }
        this.mNewIndicator.setVisibility(0);
        this.mIndicatorBar.setVisibility(8);
    }

    private void jumpToRightVideoArea() {
        DWInstance b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d35569c", new Object[]{this});
            return;
        }
        this.mIndicatorBar.setPicIndexTextVisibility(4);
        this.mDescEntrance.setVisibility(8);
        this.mIndicatorBar.hidePicDescText();
        this.mSkubar.hide(null);
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b bVar = this.mSubItemViewModels.get(0);
        if ((bVar instanceof d) && (b2 = ((d) bVar).b()) != null) {
            b2.pauseVideo();
        }
        if (this.enableCollorateConfig) {
            List<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b> galleryVideoViewModelNew = getGalleryVideoViewModelNew();
            if (galleryVideoViewModelNew != null && galleryVideoViewModelNew.size() > 0) {
                for (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b bVar2 : galleryVideoViewModelNew) {
                    DWInstance b3 = bVar2.b();
                    if (b3 != null) {
                        b3.pauseVideo();
                    }
                }
            }
            int max = Math.max(this.mTBMultiMediaModel.childModels.size() - 2, 0);
            if (!(this.mTBMultiMediaModel.childModels.get(max) instanceof GalleryVideoModel)) {
                return;
            }
            this.mGalleyView.scrollToPosition(max);
            return;
        }
        int size = this.mTBMultiMediaModel.childModels.size();
        for (int i = 0; i < size; i++) {
            if (this.mTBMultiMediaModel.childModels.get(i) instanceof GalleryVideoModel) {
                this.mGalleyView.scrollToPosition(i);
                return;
            }
        }
    }

    private void jumpToImageArea() {
        DWInstance b2;
        DWInstance b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9033ac46", new Object[]{this});
        } else if (hasVideo() || hasRightVideo()) {
            if (this.enableCollorateConfig) {
                this.mCurrentImgIndex = 2;
                if (this.mCurrentImgIndex == this.mShowIndex && !this.isCollocateWeexLoaded) {
                    showCollocateFloat();
                }
                updateFloatState();
            }
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b bVar = this.mSubItemViewModels.get(0);
            if ((bVar instanceof d) && (b3 = ((d) bVar).b()) != null) {
                b3.pauseVideo();
            }
            if (this.enableCollorateConfig) {
                List<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b> galleryVideoViewModelNew = getGalleryVideoViewModelNew();
                if (galleryVideoViewModelNew != null && galleryVideoViewModelNew.size() > 0) {
                    for (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b bVar2 : galleryVideoViewModelNew) {
                        DWInstance b4 = bVar2.b();
                        if (b4 != null) {
                            b4.pauseVideo();
                        }
                    }
                }
            } else {
                com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b galleryVideoViewModel = getGalleryVideoViewModel();
                if (galleryVideoViewModel != null && (b2 = galleryVideoViewModel.b()) != null) {
                    b2.pauseVideo();
                }
            }
            if (this.mIndicatorBar != null && this.mTBMultiMediaModel != null) {
                if (this.mTBMultiMediaModel.isPopupMode) {
                    this.mIndicatorBar.setBottomMarginByPixel(epo.n);
                } else {
                    this.mIndicatorBar.setBottomMarginByPixel(epo.k);
                }
            }
            if (this.mTBMultiMediaModel.childModels.size() > 2) {
                this.mTBMultiMediaModel.currentIndex = 1;
                this.mIndicatorBar.setExtraButtonSelected(true);
                this.mBlackLightIndicatorBar.setExtraButtonSelected(true);
                int size = this.mTBMultiMediaModel.childModels.size() - (hasVideo() ? 2 : 1);
                if (hasRightVideo()) {
                    size--;
                }
                this.mIndicatorBar.setPicIndexText(1, size);
                this.mIndicatorBar.setPicIndexTextVisibility(0);
            }
            this.mGalleyView.scrollToPosition(1);
            if (this.mTBMultiMediaModel != null && this.mTBMultiMediaModel.childModels != null && 2 <= this.mTBMultiMediaModel.childModels.size() && this.mTBMultiMediaModel.childModels.size() - 1 == 1) {
                this.mGalleyView.scrollToPosition(0);
                if (this.mTBMultiMediaModel.isPopupMode) {
                    dzh.g(this.mContext, this.mTBMultiMediaModel);
                } else {
                    dzh.f(this.mContext, this.mTBMultiMediaModel);
                }
                f.a(this.mContext, new edp());
                if (this.mTBMultiMediaModel.isPopupMode) {
                    f.a(this.mContext, new DetailEvent(1));
                }
            }
            if (this.mNewIndicator == null || this.mTBMultiMediaModel == null || this.mTBMultiMediaModel.childModels == null || this.mTBMultiMediaModel.childModels.size() < 2) {
                return;
            }
            int childrenSize = getChildrenSize() - 1;
            if (this.mTBMultiMediaModel.childModels.get(0) instanceof VideoModel) {
                this.mNewIndicator.setText("2/" + childrenSize);
                this.mCurrentImgIndex = 2;
                return;
            }
            this.mNewIndicator.setText("1/" + childrenSize);
            this.mCurrentImgIndex = 1;
        }
    }

    private void jumpToVideoAnchor(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3b3dbf", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            jumpToVideoAnchor(i, z, false);
        }
    }

    private void jumpToVideoAnchor(int i, boolean z, boolean z2) {
        DWInstance b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2d2cf5", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mIndicatorBar.setPicIndexTextVisibility(4);
        if (i < 0 || !hasVideo()) {
            return;
        }
        if (this.enableCollorateConfig) {
            List<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b> galleryVideoViewModelNew = getGalleryVideoViewModelNew();
            if (galleryVideoViewModelNew != null && galleryVideoViewModelNew.size() > 0) {
                for (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b bVar : galleryVideoViewModelNew) {
                    DWInstance b3 = bVar.b();
                    if (b3 != null) {
                        b3.pauseVideo();
                    }
                }
            }
        } else {
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b galleryVideoViewModel = getGalleryVideoViewModel();
            if (galleryVideoViewModel != null && (b2 = galleryVideoViewModel.b()) != null) {
                b2.pauseVideo();
            }
        }
        this.mTBMultiMediaModel.currentIndex = 0;
        this.mGalleyView.scrollToPosition(0);
        int currrentPosition = this.mIndicatorBar.getCurrrentPosition();
        int max = Math.max(this.mTBMultiMediaModel.currentIndex, 0);
        try {
            SubItemModel subItemModel = this.mTBMultiMediaModel.childModels.get(max);
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b bVar2 = this.mSubItemViewModels.get(max);
            if (!(subItemModel instanceof VideoModel) || !(bVar2 instanceof d)) {
                return;
            }
            VideoModel videoModel = (VideoModel) subItemModel;
            d dVar = (d) bVar2;
            if (i >= videoModel.anchors.size()) {
                dVar.onDisappeared();
                jumpToImageArea();
                return;
            }
            dVar.onAppeared();
            int i2 = i > 0 ? videoModel.anchors.get(i - 1).endTime : 1;
            DWInstance b4 = dVar.b();
            if (b4 != null) {
                if (b4.getVideoState() != 1 && b4.getVideoState() != 2) {
                    dVar.a(i2);
                    b4.start();
                    this.mIndicatorBar.setTag(null);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("转跳到时间点：");
                sb.append(i2);
                sb.append("，取的锚点index == ");
                sb.append(i - 1);
                i.d("MyLog", sb.toString());
                b4.seekTo(i2);
                b4.playVideo();
                this.mIndicatorBar.setTag(null);
            }
            if (z2 && videoModel.anchors.size() > 1) {
                if (i > currrentPosition) {
                    dVar.d();
                } else {
                    dVar.c();
                }
            }
            if (z) {
                this.mIndicatorBar.setCurrentPosition(i);
                this.mBlackLightIndicatorBar.setCurrentPosition(i);
            }
            this.mIndicatorBar.setExtraButtonSelected(false);
            this.mIndicatorBar.updateRightIndicatorState(false);
        } catch (Throwable th) {
            i.d(MultiMediaViewModel.TAG, th.toString());
        }
    }

    private void removeGalleryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d85cf4", new Object[]{this});
        } else if (this.enableCollorateConfig) {
            if (this.mVideoModelCache.size() == 0) {
                updateFloatState();
            }
            for (GalleryVideoModel galleryVideoModel : getOrderedList(2, this.mVideoModelCache)) {
                this.galleryUtils.a(galleryVideoModel);
            }
        } else {
            this.galleryUtils.a(this.mTBMultiMediaModel.mGalleryVideoModel);
        }
    }

    private void addGalleryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51cd0311", new Object[]{this});
        } else if (this.enableCollorateConfig) {
            if (this.mVideoModelCache.size() == 0) {
                updateFloatState();
            }
            for (GalleryVideoModel galleryVideoModel : getOrderedList(1, this.mVideoModelCache)) {
                this.galleryUtils.c(galleryVideoModel);
            }
        } else {
            this.galleryUtils.c(this.mTBMultiMediaModel.mGalleryVideoModel);
        }
    }

    private List<GalleryVideoModel> getOrderedList(int i, List<GalleryVideoModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("47fbc94f", new Object[]{this, new Integer(i), list});
        }
        if (i == 1) {
            Collections.sort(list);
        } else if (i == 2) {
            Collections.sort(list, Collections.reverseOrder());
        }
        return list;
    }

    private boolean popMultiMedia(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffd6d555", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        notifyDataSetChanged();
        if (this.mTBMultiMediaModel == null || this.mTBMultiMediaModel.isPopupMode) {
            return false;
        }
        this.mTBMultiMediaModel.popupParentView = this.mContentView;
        this.mTBMultiMediaModel.popupView = this.mPortableView;
        this.mTBMultiMediaModel.isFromDetailMain = true;
        switchToPopupOrNotMode(true);
        if (this.mTBMultiMediaModel.currentIndex == 0 && 1003 == this.mTBMultiMediaModel.children.get(0).intValue()) {
            ((VideoModel) this.mTBMultiMediaModel.childModels.get(0)).popupPlayFlag = true;
        }
        setVideoFlowState(0);
        f.a(this.mContext, new n(this.mTBMultiMediaModel), new c<com.taobao.android.trade.event.i>() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.event.c
            public void onEventException(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                }
            }

            @Override // com.taobao.android.trade.event.c
            public void a(com.taobao.android.trade.event.i iVar, j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e2d27b9", new Object[]{this, iVar, jVar});
                    return;
                }
                i.a(MultiMediaViewModel.TAG, "pop onEventComplete: ");
                if (!z) {
                    return;
                }
                if (GalleryViewModelEx.access$10400(GalleryViewModelEx.this) != null) {
                    GalleryViewModelEx.access$10500(GalleryViewModelEx.this).currentIndex = 0;
                }
                GalleryViewModelEx.access$10600(GalleryViewModelEx.this).scrollToPosition(0);
                int lastPosition = GalleryViewModelEx.access$10700(GalleryViewModelEx.this).getLastPosition();
                if (lastPosition >= GalleryViewModelEx.access$10800(GalleryViewModelEx.this).getTotalAnchorNum()) {
                    lastPosition = GalleryViewModelEx.access$10900(GalleryViewModelEx.this).getTotalAnchorNum() - 1;
                }
                GalleryViewModelEx.access$11000(GalleryViewModelEx.this).setCurrentPosition(lastPosition);
                GalleryViewModelEx.access$11200(GalleryViewModelEx.this).setPicIndexText(1, GalleryViewModelEx.access$11100(GalleryViewModelEx.this).getTotalAnchorNum());
                GalleryViewModelEx.access$11300(GalleryViewModelEx.this);
                GalleryViewModelEx.access$11400(GalleryViewModelEx.this).setCurrentPosition(lastPosition);
            }
        });
        return true;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel, android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff6aa58", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        super.onBindViewHolder(aVar, i);
        if (i != 0) {
            return;
        }
        dzh.h(this.mContext, this.mTBMultiMediaModel);
    }

    @Override // com.taobao.android.trade.event.j
    public com.taobao.android.trade.event.i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (this.mTBMultiMediaModel == null) {
            return com.taobao.android.trade.event.i.SUCCESS;
        }
        if ((this.mTBMultiMediaModel.childModels.get(0) instanceof NormalImageModel) && StringUtils.isEmpty(((NormalImageModel) this.mTBMultiMediaModel.childModels.get(0)).imageUrl)) {
            return com.taobao.android.trade.event.i.SUCCESS;
        }
        if (event instanceof DetailEvent) {
            handleDetailEvent(event);
        } else if (eno.a(com.taobao.android.detail.core.event.basic.d.class) == event.getEventId()) {
            handleGalleryPopPathEvent(event);
        } else if (eno.a(com.taobao.android.detail.wrapper.ext.event.b.class) == event.getEventId()) {
            if (this.mTBMultiMediaModel.isPopupMode) {
                setVideoFlowState(0);
            }
        } else if (eno.a(com.taobao.android.detail.wrapper.ext.event.a.class) == event.getEventId() && this.mTBMultiMediaModel.isPopupMode) {
            setVideoFlowState(1);
        }
        return com.taobao.android.trade.event.i.SUCCESS;
    }

    private com.taobao.android.trade.event.i handleDetailEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("187803bf", new Object[]{this, event});
        }
        if (2 == ((DetailEvent) event).getEventType()) {
            if (this.mTBMultiMediaModel != null && this.mTBMultiMediaModel.isPopupMode && !this.enableCollorateConfig) {
                this.galleryUtils.a(this.mTBMultiMediaModel);
            }
            this.mTBMultiMediaModel.isPopupMode = false;
            switchToPopupOrNotMode(false);
            ViewGroup viewGroup = (ViewGroup) this.mPortableView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.mPortableView);
            }
            this.mContentView.addView(this.mPortableView, this.RELATIVE_LAYOUT_MATCH_PARENT);
            if (this.mTBMultiMediaModel == null) {
                return com.taobao.android.trade.event.i.SUCCESS;
            }
            this.mGalleyView.scrollToPosition(this.mTBMultiMediaModel.currentIndex);
            setVideoFlowState(1);
        }
        return com.taobao.android.trade.event.i.SUCCESS;
    }

    private com.taobao.android.trade.event.i handleGalleryPopPathEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("5ccb1fd2", new Object[]{this, event});
        }
        if (1003 == this.mTBMultiMediaModel.children.get(0).intValue()) {
            VideoModel videoModel = (VideoModel) this.mTBMultiMediaModel.childModels.get(0);
            if (videoModel.needAutoPlay) {
                videoModel.isPlayState = true;
                videoModel.needAutoPlay = false;
            }
            videoModel.popupPlayFlag = true;
        }
        popMultiMedia(true);
        this.mTBMultiMediaModel.popGallerySource = ((com.taobao.android.detail.core.event.basic.d) event).f9699a;
        return com.taobao.android.trade.event.i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public GalleryViewModelEx(Context context) {
        super(context);
        this.mInsertIndex = 3;
        boolean z = false;
        this.isCollocateWeexLoaded = false;
        this.linearLayoutManager = null;
        this.mNeedToJumpBackToLast = true;
        this.mContainerHeight = 0;
        this.shakeCount = 0L;
        this.mVideoModelCache = new ArrayList();
        this.galleryOnPageChangedListener = new RecyclerViewPager.a() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager.a
            public void a(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                GalleryViewModelEx.access$002(GalleryViewModelEx.this, i2 + 1);
                if (GalleryViewModelEx.access$100(GalleryViewModelEx.this) == GalleryViewModelEx.access$200(GalleryViewModelEx.this) && !GalleryViewModelEx.access$300(GalleryViewModelEx.this) && GalleryViewModelEx.access$400(GalleryViewModelEx.this)) {
                    GalleryViewModelEx.access$500(GalleryViewModelEx.this);
                }
                GalleryViewModelEx.access$600(GalleryViewModelEx.this);
                try {
                    ((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b) GalleryViewModelEx.access$700(GalleryViewModelEx.this).get(i)).onDisappeared();
                } catch (IndexOutOfBoundsException unused) {
                }
                try {
                    ((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b) GalleryViewModelEx.access$800(GalleryViewModelEx.this).get(i2)).onAppeared();
                } catch (IndexOutOfBoundsException unused2) {
                }
                if (GalleryViewModelEx.access$900(GalleryViewModelEx.this).childModels.size() - 1 > i2) {
                    GalleryViewModelEx.access$1000(GalleryViewModelEx.this).currentIndex = i2;
                }
                GalleryViewModelEx.this.setAivTimeTunnel();
                if (GalleryViewModelEx.access$1100(GalleryViewModelEx.this) == null || GalleryViewModelEx.access$1200(GalleryViewModelEx.this).childModels == null || 2 > GalleryViewModelEx.access$1300(GalleryViewModelEx.this).childModels.size() || GalleryViewModelEx.access$1400(GalleryViewModelEx.this).childModels.size() - 1 != i2) {
                    return;
                }
                GalleryViewModelEx.access$1600(GalleryViewModelEx.this).scrollToPosition(GalleryViewModelEx.access$1500(GalleryViewModelEx.this).childModels.size() - 2);
                if (GalleryViewModelEx.access$1700(GalleryViewModelEx.this).isPopupMode) {
                    dzh.g(GalleryViewModelEx.access$1800(GalleryViewModelEx.this), GalleryViewModelEx.access$1900(GalleryViewModelEx.this));
                } else {
                    dzh.f(GalleryViewModelEx.access$2000(GalleryViewModelEx.this), GalleryViewModelEx.access$2100(GalleryViewModelEx.this));
                }
                try {
                    com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b bVar = (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b) GalleryViewModelEx.access$2200(GalleryViewModelEx.this).get(i2);
                    if ((bVar instanceof com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.a) && ((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.a) bVar).b() != null) {
                        BounceImageModel b2 = ((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.a) bVar).b();
                        if (b2.hasPicGallaryOverScroll()) {
                            JSONArray mainPicAction = b2.getMainPicAction();
                            if (GalleryViewModelEx.access$2300(GalleryViewModelEx.this).isPopupMode) {
                                mainPicAction = b2.getLightOffAction();
                            }
                            if (mainPicAction != null) {
                                try {
                                    Iterator<Object> it = mainPicAction.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        if (next instanceof JSONObject) {
                                            f.a(GalleryViewModelEx.access$2600(GalleryViewModelEx.this)).a(ehs.a(GalleryViewModelEx.access$2500(GalleryViewModelEx.this), new ActionModel((JSONObject) next), ((DetailActivity) GalleryViewModelEx.access$2400(GalleryViewModelEx.this)).y().h.f27459a.f10055a, null, null));
                                        }
                                    }
                                    return;
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    i.a(MultiMediaViewModel.TAG, "头图右滑error: " + Log.getStackTraceString(e));
                }
                f.a(GalleryViewModelEx.access$2700(GalleryViewModelEx.this), new edp());
                if (!GalleryViewModelEx.access$2800(GalleryViewModelEx.this).isPopupMode) {
                    return;
                }
                f.a(GalleryViewModelEx.access$2900(GalleryViewModelEx.this), new DetailEvent(1));
            }
        };
        this.pageChangedListenerForSize = new RecyclerViewPager.a() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager.a
            public void a(int i, int i2) {
                IndicatorBar access$8400;
                int i3;
                int access$9400;
                IndicatorBar access$8100;
                int i4;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                d access$3000 = GalleryViewModelEx.access$3000(GalleryViewModelEx.this);
                if (i2 == 0) {
                    if (access$3000 != null && GalleryViewModelEx.access$3100(GalleryViewModelEx.this) != null && GalleryViewModelEx.access$3200(GalleryViewModelEx.this) != null && GalleryViewModelEx.access$3300(GalleryViewModelEx.this)) {
                        int lastPosition = GalleryViewModelEx.access$3400(GalleryViewModelEx.this).getLastPosition();
                        GalleryViewModelEx.access$3500(GalleryViewModelEx.this).setCurrentPosition(lastPosition);
                        GalleryViewModelEx.access$3600(GalleryViewModelEx.this).setCurrentPosition(lastPosition);
                    }
                    if (access$3000 != null) {
                        GalleryViewModelEx.access$3700(GalleryViewModelEx.this).setExtraButtonSelected(false);
                        GalleryViewModelEx.access$3800(GalleryViewModelEx.this).updateRightIndicatorState(false);
                    }
                } else if (i2 == GalleryViewModelEx.access$3900(GalleryViewModelEx.this)) {
                    GalleryViewModelEx.access$4000(GalleryViewModelEx.this).updateRightIndicatorState(true);
                    GalleryViewModelEx.access$4100(GalleryViewModelEx.this).setPicIndexTextVisibility(4);
                    GalleryViewModelEx.access$4200(GalleryViewModelEx.this).setVisibility(8);
                    GalleryViewModelEx.access$4300(GalleryViewModelEx.this).hidePicDescText();
                    GalleryViewModelEx.access$4400(GalleryViewModelEx.this).hide(null);
                    if (access$3000 != null) {
                        GalleryViewModelEx.access$4500(GalleryViewModelEx.this).showIndicator();
                    }
                    if (GalleryViewModelEx.access$4600(GalleryViewModelEx.this) != null) {
                        GalleryViewModelEx.access$4800(GalleryViewModelEx.this).updateGalleryLeftContainerState(GalleryViewModelEx.access$4700(GalleryViewModelEx.this).mOpenUrlGalleryItemNode);
                        GalleryViewModelEx.access$5000(GalleryViewModelEx.this).updateGalleryRightContainerState(GalleryViewModelEx.access$4900(GalleryViewModelEx.this).mVideoGalleryItemNode);
                    }
                    GalleryViewModelEx.access$5100(GalleryViewModelEx.this).setExtraButtonVisiblity(0);
                } else if (GalleryViewModelEx.access$5200(GalleryViewModelEx.this).childModels.size() > 2) {
                    SubItemModel subItemModel = GalleryViewModelEx.access$5300(GalleryViewModelEx.this).childModels.get(i2);
                    if (subItemModel != null && (subItemModel instanceof NormalImageModel)) {
                        GalleryViewModelEx.access$5400(GalleryViewModelEx.this).setExtraButtonSelected(true);
                        GalleryViewModelEx.access$5500(GalleryViewModelEx.this).setBottomMarginByPixel(epo.k);
                        NormalImageModel normalImageModel = (NormalImageModel) subItemModel;
                        if (!normalImageModel.isSkuPic) {
                            GalleryViewModelEx.access$5600(GalleryViewModelEx.this).hide(null);
                            GalleryViewModelEx.access$5700(GalleryViewModelEx.this).setVisibility(8);
                            GalleryViewModelEx.access$5800(GalleryViewModelEx.this).hidePicDescText();
                            if (access$3000 != null) {
                                GalleryViewModelEx.access$5900(GalleryViewModelEx.this).setExtraButtonVisiblity(0);
                            }
                            if (GalleryViewModelEx.access$6000(GalleryViewModelEx.this) != null) {
                                GalleryViewModelEx.access$6200(GalleryViewModelEx.this).updateGalleryLeftContainerState(GalleryViewModelEx.access$6100(GalleryViewModelEx.this).mOpenUrlGalleryItemNode);
                                GalleryViewModelEx.access$6400(GalleryViewModelEx.this).updateGalleryRightContainerState(GalleryViewModelEx.access$6300(GalleryViewModelEx.this).mVideoGalleryItemNode);
                            }
                            GalleryViewModelEx.access$6500(GalleryViewModelEx.this).showIndicator();
                        } else {
                            GalleryViewModelEx.access$6600(GalleryViewModelEx.this).hideIndicatorAndExtraButton();
                            if (GalleryViewModelEx.access$6700(GalleryViewModelEx.this).isPopupMode) {
                                GalleryViewModelEx.access$6800(GalleryViewModelEx.this).hide(null);
                                GalleryViewModelEx.access$6900(GalleryViewModelEx.this).setVisibility(8);
                                GalleryViewModelEx.access$7000(GalleryViewModelEx.this).showPicDescText(normalImageModel.propRate.f9994a);
                            } else {
                                GalleryViewModelEx.access$7100(GalleryViewModelEx.this).updateData(normalImageModel.propRate);
                                GalleryViewModelEx.access$7200(GalleryViewModelEx.this).setVisibility(0);
                                GalleryViewModelEx.access$7300(GalleryViewModelEx.this).hidePicDescText();
                            }
                        }
                    }
                    GalleryViewModelEx.access$7400(GalleryViewModelEx.this).setExtraButtonSelected(true);
                }
                if (GalleryViewModelEx.access$7500(GalleryViewModelEx.this) != null) {
                    if (!GalleryViewModelEx.access$7600(GalleryViewModelEx.this).isPopupMode) {
                        if (i2 != 0) {
                            access$8100 = GalleryViewModelEx.access$8000(GalleryViewModelEx.this);
                        } else if (access$3000 != null && access$3000.b() != null && GalleryViewModelEx.access$7700(GalleryViewModelEx.this) != null) {
                            if (access$3000.b().getVideoState() == 2 || access$3000.b().getVideoState() == 1) {
                                access$3000.b().showController();
                                GalleryViewModelEx.access$7800(GalleryViewModelEx.this).setBottomMarginByPixel(access$3000.e());
                            } else {
                                access$8100 = GalleryViewModelEx.access$7900(GalleryViewModelEx.this);
                            }
                        }
                        i4 = epo.k;
                    } else {
                        access$8100 = GalleryViewModelEx.access$8100(GalleryViewModelEx.this);
                        i4 = epo.n;
                    }
                    access$8100.setBottomMarginByPixel(i4);
                }
                GalleryViewModelEx.access$3302(GalleryViewModelEx.this, true);
                if (GalleryViewModelEx.access$8200(GalleryViewModelEx.this) && i2 == 0) {
                    access$8400 = GalleryViewModelEx.access$8300(GalleryViewModelEx.this);
                } else if (i2 != GalleryViewModelEx.access$3900(GalleryViewModelEx.this)) {
                    if (GalleryViewModelEx.access$8500(GalleryViewModelEx.this).childModels.size() > 2) {
                        int i5 = GalleryViewModelEx.access$8600(GalleryViewModelEx.this) ? i2 : i2 + 1;
                        int size = GalleryViewModelEx.access$8700(GalleryViewModelEx.this) ? GalleryViewModelEx.access$8800(GalleryViewModelEx.this).childModels.size() - 2 : GalleryViewModelEx.access$8900(GalleryViewModelEx.this).childModels.size() - 1;
                        if (GalleryViewModelEx.access$9000(GalleryViewModelEx.this)) {
                            size--;
                        }
                        if (i5 <= size) {
                            GalleryViewModelEx.access$9100(GalleryViewModelEx.this).setPicIndexText(i5, size);
                            GalleryViewModelEx.access$9200(GalleryViewModelEx.this).setPicIndexTextVisibility(0);
                        }
                    }
                    if (GalleryViewModelEx.access$9300(GalleryViewModelEx.this) == null || (i3 = i2 + 1) > (access$9400 = GalleryViewModelEx.access$9400(GalleryViewModelEx.this) - 1)) {
                    }
                    GalleryViewModelEx.access$9500(GalleryViewModelEx.this).setText(i3 + "/" + access$9400);
                    return;
                } else {
                    access$8400 = GalleryViewModelEx.access$8400(GalleryViewModelEx.this);
                }
                access$8400.setPicIndexTextVisibility(4);
                if (GalleryViewModelEx.access$9300(GalleryViewModelEx.this) == null) {
                }
            }
        };
        this.mGestureDetector = new GestureDetector(this.mContext, new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 anonymousClass11, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode != -223117518) {
                    if (hashCode != 307521857) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                    return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
                }
                return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue() : super.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                DWInstance b2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
                }
                com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b bVar = null;
                int i = GalleryViewModelEx.access$9800(GalleryViewModelEx.this).currentIndex;
                if (i >= 0 && i < GalleryViewModelEx.access$9900(GalleryViewModelEx.this).size()) {
                    bVar = (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b) GalleryViewModelEx.access$10000(GalleryViewModelEx.this).get(i);
                }
                if ((bVar instanceof d) && (b2 = ((d) bVar).b()) != null && b2.getVideoState() == 1) {
                    int currrentPosition = GalleryViewModelEx.access$10100(GalleryViewModelEx.this).getCurrrentPosition();
                    if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > 200.0f) {
                        if (motionEvent2.getX() > motionEvent.getX()) {
                            GalleryViewModelEx.access$10200(GalleryViewModelEx.this, currrentPosition - 1, true, true);
                        } else if (motionEvent2.getX() < motionEvent.getX()) {
                            if (b2.getVideoState() != 1) {
                                GalleryViewModelEx.access$10300(GalleryViewModelEx.this);
                            } else {
                                GalleryViewModelEx.access$10200(GalleryViewModelEx.this, currrentPosition + 1, true, true);
                            }
                        }
                        return true;
                    }
                }
                GalleryViewModelEx.access$3302(GalleryViewModelEx.this, true);
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
        });
        this.transparency = 1.0f;
        this.historyY = 0;
        this.BLACKLIGHT_START = 0;
        this.BLACKLIGHT_STOP = 1;
        this.mBlacklightDuration = 0L;
        this.start = null;
        this.end = null;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx");
        this.galleryUtils = mo897getUtils();
        com.taobao.android.trade.event.d a2 = f.a(context);
        z = (this.mTBMultiMediaModel == null || !this.mTBMultiMediaModel.isPopupMode) ? true : z;
        if (a2 == null || !z) {
            return;
        }
        a2.a(eno.a(DetailEvent.class), this);
        a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.b.class), this);
        a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.a.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.basic.d.class), this);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void reRenderViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48afe97e", new Object[]{this, aVar});
        } else {
            super.reRenderViewHolder(aVar);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel
    public void render() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.render();
        setAivTimeTunnel();
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
            return;
        }
        super.bindModel(subItemModel);
        if (!hasVideo()) {
            int size = this.mTBMultiMediaModel.childModels.size() - 1;
            if (hasRightVideo()) {
                size--;
            }
            this.mIndicatorBar.setPicIndexText(1, size);
            this.mIndicatorBar.setPicIndexTextVisibility(0);
        } else {
            this.mIndicatorBar.setPicIndexTextVisibility(4);
        }
        if (this.mTBMultiMediaModel != null && this.mSkubar != null) {
            this.mSkubar.setNodeBundle(this.mTBMultiMediaModel.nodeBundle);
        }
        if (this.mTBMultiMediaModel != null && this.mTBMultiMediaModel.mGalleryVideoModel != null && this.enableCollorateConfig) {
            this.mVideoModelCache.add(this.mTBMultiMediaModel.mGalleryVideoModel);
        }
        resetGalleyViewSize(0);
        if (this.mNewIndicator != null) {
            this.mNewIndicator.setText("1/" + (getChildrenSize() - 1));
        }
        insertAsyncCollection();
    }

    /* loaded from: classes5.dex */
    public class a extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AtomicBoolean f11187a;

        static {
            kge.a(-1402315947);
        }

        public a(Context context) {
            super(context);
            this.f11187a = new AtomicBoolean(false);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f11187a.set(z);
            }
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public RecyclerView.LayoutParams generateDefaultLayoutParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.LayoutParams) ipChange.ipc$dispatch("fdddbac1", new Object[]{this}) : new RecyclerView.LayoutParams(GalleryViewModelEx.access$11500(GalleryViewModelEx.this).c(), -1);
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            DWInstance b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
            }
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b bVar = null;
            if (GalleryViewModelEx.access$11600(GalleryViewModelEx.this) == null) {
                return false;
            }
            int i = GalleryViewModelEx.access$11700(GalleryViewModelEx.this).currentIndex;
            if (i >= 0 && i < GalleryViewModelEx.access$11800(GalleryViewModelEx.this).size()) {
                bVar = (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b) GalleryViewModelEx.access$11900(GalleryViewModelEx.this).get(i);
            }
            if ((bVar instanceof d) && (b = ((d) bVar).b()) != null && b.getVideoState() == 1) {
                return false;
            }
            if (!(bVar instanceof com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c)) {
                return !GalleryViewModelEx.access$12100(GalleryViewModelEx.this).isPopupMode || !this.f11187a.get();
            }
            TouchImageView c = ((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c) bVar).c();
            return c == null || !c.canScrollHorizontally(GalleryViewModelEx.access$12000(GalleryViewModelEx.this).getDx());
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            super.onPause(z, z2);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        setEventListenerToVideoViewModle();
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.taobao.android.trade.event.d a2 = f.a(this.mContext);
        a2.b(eno.a(DetailEvent.class), this);
        a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.b.class), this);
        a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.a.class), this);
        List<GalleryVideoModel> list = this.mVideoModelCache;
        if (list != null) {
            list.clear();
        }
        super.onDestroy();
    }

    private void setTextToPicIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdde38a", new Object[]{this, new Integer(i)});
        } else if (hasVideo() && i == 0) {
            this.mIndicatorBar.setPicIndexTextVisibility(4);
        } else if (this.mTBMultiMediaModel.childModels.size() <= 2) {
        } else {
            if (!hasVideo()) {
                i++;
            }
            int size = hasVideo() ? this.mTBMultiMediaModel.childModels.size() - 2 : this.mTBMultiMediaModel.childModels.size() - 1;
            if (hasRightVideo()) {
                size--;
            }
            if (i > size) {
                return;
            }
            this.mIndicatorBar.setPicIndexText(i, size);
            this.mIndicatorBar.setPicIndexTextVisibility(0);
        }
    }

    private void judgeShowPicIndexOrNot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd312d9b", new Object[]{this});
        } else if (this.mIndicatorBar.getExtraButtonSelected() || !hasVideo()) {
            this.mIndicatorBar.setPicIndexTextVisibility(0);
        } else {
            this.mIndicatorBar.setPicIndexTextVisibility(4);
        }
    }

    public void customContainerView(RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b6b144", new Object[]{this, relativeLayout});
            return;
        }
        this.mGalleyView.setTriggerOffset(0.15f);
        this.mGalleyView.setFlingFactor(0.25f);
        this.mGalleyView.setSinglePageFling(true);
        this.layoutManager = new a(this.mContext);
        this.layoutManager.setOrientation(0);
        this.mGalleyView.addOnPageChangedListener(this.galleryOnPageChangedListener);
        this.mGalleyView.addOnPageChangedListener(this.pageChangedListenerForSize);
        this.mGalleyView.setLayoutManager(this.layoutManager);
        this.mGalleyView.addOnItemTouchListener(new RecyclerView.SimpleOnItemTouchListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 anonymousClass13, String str, Object... objArr) {
                if (str.hashCode() == -513064276) {
                    return new Boolean(super.onInterceptTouchEvent((RecyclerView) objArr[0], (MotionEvent) objArr[1]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.SimpleOnItemTouchListener, android.support.v7.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("e16b42ac", new Object[]{this, recyclerView, motionEvent})).booleanValue() : GalleryViewModelEx.access$12200(GalleryViewModelEx.this).onTouchEvent(motionEvent) || super.onInterceptTouchEvent(recyclerView, motionEvent);
            }
        });
        if (this.mIndicatorBar != null) {
            this.mIndicatorBar.setBottomMarginByPixel(epo.k);
            this.mIndicatorBar.setIndicatorBarClickListener(new IndicatorBar.b() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.b
                public int a(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
                    }
                    GalleryViewModelEx.access$12302(GalleryViewModelEx.this, i2);
                    GalleryViewModelEx.access$3302(GalleryViewModelEx.this, false);
                    GalleryViewModelEx.access$12400(GalleryViewModelEx.this, i2, false);
                    d access$3000 = GalleryViewModelEx.access$3000(GalleryViewModelEx.this);
                    if (GalleryViewModelEx.access$12500(GalleryViewModelEx.this).getExtraButtonSelected() && access$3000 != null && access$3000.b() != null) {
                        access$3000.b().showController();
                        if (!GalleryViewModelEx.access$12600(GalleryViewModelEx.this).getIsPopupMode()) {
                            GalleryViewModelEx.access$12700(GalleryViewModelEx.this).setBottomMarginByPixel(access$3000.e());
                        }
                    }
                    if (GalleryViewModelEx.access$12800(GalleryViewModelEx.this) != null) {
                        GalleryViewModelEx.access$12900(GalleryViewModelEx.this).setCurrentPosition(i2);
                    }
                    GalleryViewModelEx.access$13000(GalleryViewModelEx.this);
                    return i2;
                }

                @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.b
                public void a(Button button, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b0237b8", new Object[]{this, button, new Boolean(z)});
                        return;
                    }
                    dzh.j(GalleryViewModelEx.access$13100(GalleryViewModelEx.this), GalleryViewModelEx.access$13200(GalleryViewModelEx.this));
                    GalleryViewModelEx.access$10300(GalleryViewModelEx.this);
                    GalleryViewModelEx.access$13300(GalleryViewModelEx.this);
                }

                @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    GalleryViewModelEx.access$13402(GalleryViewModelEx.this, -1);
                    GalleryViewModelEx.access$13500(GalleryViewModelEx.this);
                    GalleryViewModelEx.access$13600(GalleryViewModelEx.this);
                }
            });
        }
        if (this.mBlackLightIndicatorBar != null) {
            this.mBlackLightIndicatorBar.setIndicatorBarClickListener(new BlackLightIndicatorBar.a() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.a
                public int a(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
                    }
                    GalleryViewModelEx.access$3302(GalleryViewModelEx.this, false);
                    int currrentPosition = GalleryViewModelEx.access$13700(GalleryViewModelEx.this).getCurrrentPosition();
                    GalleryViewModelEx.access$12400(GalleryViewModelEx.this, currrentPosition, true);
                    return currrentPosition;
                }

                @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.a
                public void a(TextView textView, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c7b4f78", new Object[]{this, textView, new Boolean(z)});
                        return;
                    }
                    dzh.j(GalleryViewModelEx.access$13800(GalleryViewModelEx.this), GalleryViewModelEx.access$13900(GalleryViewModelEx.this));
                    GalleryViewModelEx.access$10300(GalleryViewModelEx.this);
                }
            });
        }
        if (this.mBlacklightClosed == null) {
            return;
        }
        this.mBlacklightClosed.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    GalleryViewModelEx.access$11500(GalleryViewModelEx.this).a(GalleryViewModelEx.access$14000(GalleryViewModelEx.this));
                }
            }
        });
    }

    private void onVesselViewCallBackInvoked(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f39a197", new Object[]{this, map, aVar});
        } else if (map == null || !map.containsKey(VESSEL_METHOD_MAP_KEY) || (obj = map.get(VESSEL_METHOD_MAP_KEY)) == null || !(obj instanceof String) || !VESSEL_METHOD_NAME_GET_NODE_BUNDLE.equals((String) obj) || aVar == null || this.mTBMultiMediaModel == null) {
        } else {
            aVar.invoke(this.mTBMultiMediaModel.nodeBundle.a());
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) ipChange.ipc$dispatch("852695bd", new Object[]{this});
        }
        if (this.mContentView == null) {
            Activity c = fpz.c(this.mContext);
            if (c instanceof DetailActivity) {
                this.mContentView = (RelativeLayout) ((DetailActivity) c).b(R.layout.x_detail_wrapper_main_new_gallery_ex);
            }
            if (this.mContentView == null) {
                this.mContentView = (RelativeLayout) LayoutInflater.from(this.mContext).inflate(R.layout.x_detail_wrapper_main_new_gallery_ex, (ViewGroup) null);
            }
        }
        this.mVesselView = (VesselView) this.mContentView.findViewById(R.id.vesselview);
        this.mNewIndictorContainer = this.mContentView.findViewById(R.id.new_gallery_indicator_container);
        this.mNewIndicator = (TextView) this.mContentView.findViewById(R.id.new_gallery_text_indicator);
        this.mPortableView = (RelativeLayout) this.mContentView.findViewById(R.id.gallery_portable_container);
        this.mGalleyView = (GalleryRecyclerView) this.mContentView.findViewById(R.id.img_gallery);
        this.mBlacklightClosed = (ImageView) this.mContentView.findViewById(R.id.blacklight_close);
        this.mIndicatorBar = (IndicatorBar) this.mContentView.findViewById(R.id.detail_main_gallery_indicator_bar);
        this.mDescEntrance = (LinearLayout) this.mContentView.findViewById(R.id.detail_main_gallery_desc_entrance);
        initDescEntranceText();
        this.mSkubar = (SkuBar) this.mContentView.findViewById(R.id.detail_main_gallery_sku_bar);
        this.mBlackLightIndicatorBar = (BlackLightIndicatorBar) this.mContentView.findViewById(R.id.detail_main_gallery_blacklight_indicator_bar);
        this.mBlackLightIndicatorBar.setVisibility(8);
        customContainerView(this.mContentView);
        this.mGalleyView.setHasFixedSize(true);
        this.mGalleyView.setAdapter(this);
        this.mGalleyView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                } else {
                    i.d(MultiMediaViewModel.TAG, "view attached");
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else {
                    i.d(MultiMediaViewModel.TAG, "view detached");
                }
            }
        });
        this.mContainerHeight = this.galleryUtils.b();
        if (this.mTBMultiMediaModel != null && !this.mTBMultiMediaModel.childModels.isEmpty()) {
            this.mContainerHeight = this.galleryUtils.e(this.mTBMultiMediaModel.childModels.get(0));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.mContainerHeight);
        layoutParams.addRule(15);
        this.mGalleyView.setLayoutParams(layoutParams);
        this.mVesselView.setLayoutParams(layoutParams);
        View findViewById = this.mContentView.findViewById(R.id.stub_view);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams2.height = this.mContainerHeight;
        findViewById.setLayoutParams(layoutParams2);
        return super.getViewHolder();
    }

    private void insertAsyncCollection() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2522a48", new Object[]{this});
        } else if (!this.enableCollorateConfig || this.mTBMultiMediaModel == null) {
        } else {
            insertCollocateFloat();
            JSONObject jSONObject4 = eqb.c(this.mTBMultiMediaModel.nodeBundle).extraMap;
            if (jSONObject4 == null || (jSONObject = jSONObject4.getJSONObject("asyncInsertAction")) == null || (jSONObject2 = jSONObject.getJSONObject("default")) == null || (jSONObject3 = jSONObject2.getJSONObject("imageAction")) == null) {
                return;
            }
            String string = jSONObject3.getString("url");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            try {
                this.mInsertIndex = jSONObject.getIntValue("index");
                if (checkPositionNotInsert(this.mInsertIndex)) {
                    return;
                }
                NormalImageModel normalImageModel = new NormalImageModel();
                normalImageModel.imageUrl = string;
                normalImageModel.parentModel = this.mTBMultiMediaModel;
                normalImageModel.setIndex(hasVideo() ? this.mInsertIndex : this.mInsertIndex - 1);
                this.galleryUtils.d(normalImageModel);
                asyncColloctionExecuteRequest(jSONObject.getJSONObject("mtopConfig"));
            } catch (Exception unused) {
            }
        }
    }

    private void asyncColloctionExecuteRequest(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a055579f", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            CollocationRequestParams collocationRequestParams = new CollocationRequestParams();
            collocationRequestParams.apiName = jSONObject.getString("apiMethod");
            collocationRequestParams.version = jSONObject.getString("apiVersion");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return;
            }
            collocationRequestParams.data = jSONObject2;
            new CollocationRequestClient(collocationRequestParams, epo.f(), new MtopRequestListener<com.taobao.android.detail.wrapper.ext.request.collection.a>() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.request.c
                public /* bridge */ /* synthetic */ void a(MtopResponse mtopResponse) {
                }

                @Override // com.taobao.android.detail.core.request.c
                public /* synthetic */ void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    } else {
                        a((com.taobao.android.detail.wrapper.ext.request.collection.a) obj);
                    }
                }

                public void a(com.taobao.android.detail.wrapper.ext.request.collection.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("28912ad2", new Object[]{this, aVar});
                        return;
                    }
                    JSONObject jSONObject3 = aVar.f11369a;
                    if (jSONObject3 == null || jSONObject3.getJSONArray("result") == null) {
                        return;
                    }
                    JSONObject jSONObject4 = jSONObject3.getJSONArray("result").getJSONObject(0);
                    if (jSONObject4 != null) {
                        GalleryViewModelEx.access$14100(GalleryViewModelEx.this, jSONObject4);
                    }
                    GalleryViewModelEx.access$14200(GalleryViewModelEx.this, jSONObject3);
                }
            }).execute();
        }
    }

    private void replaceCollocateData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b63301", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("videoAction");
        JSONObject jSONObject3 = jSONObject.getJSONObject("imageAction");
        if (jSONObject2 != null && !StringUtils.isEmpty(jSONObject2.getString("url"))) {
            SubItemModel videoModel = getVideoModel();
            String str = videoModel instanceof VideoModel ? ((VideoModel) videoModel).spatialVideoDimension : emh.sDefaultDimension;
            String string = jSONObject2.getString("url");
            String string2 = jSONObject2.getString("videoId");
            String string3 = jSONObject2.getString("videoThumbnailURL");
            GalleryVideoModel galleryVideoModel = new GalleryVideoModel(new GalleryNode.GalleryItemNode(JSONObject.parseObject("{\"content\":{\"data\":{\"coverUrl\":\"" + string3 + "\",\"videoId\":\"" + string2 + "\",\"videoUrl\":\"" + string + "\",\"videoRatio\":\"" + str + "\"},\"type\":\"video\"}}")), this.mTBMultiMediaModel, true);
            galleryVideoModel.setIndex(hasVideo() ? this.mInsertIndex : this.mInsertIndex - 1);
            this.galleryUtils.b(galleryVideoModel);
            this.mVideoModelCache.add(galleryVideoModel);
        } else if (jSONObject3 == null || StringUtils.isEmpty(jSONObject3.getString("url"))) {
        } else {
            NormalImageModel normalImageModel = new NormalImageModel();
            normalImageModel.imageUrl = jSONObject3.getString("url");
            normalImageModel.parentModel = this.mTBMultiMediaModel;
            normalImageModel.setIndex(hasVideo() ? this.mInsertIndex : this.mInsertIndex - 1);
            this.galleryUtils.b(normalImageModel);
        }
    }

    private void saveCollocateData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554a1d8a", new Object[]{this, jSONObject});
        } else if (this.mTBMultiMediaModel == null || this.mTBMultiMediaModel.nodeBundle == null) {
        } else {
            JSONObject a2 = this.mTBMultiMediaModel.nodeBundle.a();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("headComponent", (Object) jSONObject);
            if (a2 == null) {
                return;
            }
            a2.put("asyncData", (Object) jSONObject2);
        }
    }

    private void insertCollocateFloat() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61dc36ca", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject2 = eqb.c(this.mTBMultiMediaModel.nodeBundle).extraMap;
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("insertFloatAction")) == null) {
                return;
            }
            this.mCollorateWeexUrl = jSONObject.getString("url");
            if (StringUtils.isEmpty(this.mCollorateWeexUrl)) {
                return;
            }
            int intValue = jSONObject.getIntValue("index");
            if (checkPositionNotInsert(intValue)) {
                return;
            }
            if (hasVideo()) {
                intValue++;
            }
            this.mShowIndex = intValue;
            this.mVesselCallback = new rgw() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rgw
                public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                    } else {
                        GalleryViewModelEx.access$14300(GalleryViewModelEx.this, map, aVar);
                    }
                }
            };
            this.mVesselView.setVesselViewCallback(this.mVesselCallback);
        } catch (Exception unused) {
        }
    }

    private void showCollocateFloat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcd460e", new Object[]{this});
        } else if (this.mVesselView == null || StringUtils.isEmpty(this.mCollorateWeexUrl)) {
        } else {
            this.mVesselView.loadUrl(this.mCollorateWeexUrl);
            this.mVesselView.setOnLoadListener(new rgu() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rgu
                public void onLoadFinish(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                    }
                }

                @Override // tb.rgu
                public void onLoadStart() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                    }
                }

                @Override // tb.rgu
                public void onLoadError(rgy rgyVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    } else {
                        onDowngrade(null, null);
                    }
                }

                @Override // tb.rgu
                public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                        return;
                    }
                    if (GalleryViewModelEx.access$14400(GalleryViewModelEx.this) != null) {
                        GalleryViewModelEx.access$14500(GalleryViewModelEx.this).setVisibility(8);
                    }
                    GalleryViewModelEx.access$14602(GalleryViewModelEx.this, false);
                }
            });
            this.isCollocateWeexLoaded = true;
            updateFloatState();
        }
    }

    private boolean checkPositionNotInsert(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1756d825", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return i <= 0 || i >= (hasVideo() ? this.mTBMultiMediaModel.childModels.size() - 1 : this.mTBMultiMediaModel.childModels.size());
    }

    private void initDescEntranceText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ecb5eb", new Object[]{this});
        } else if (this.mDescEntrance == null) {
        } else {
            this.mDescEntrance.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (GalleryViewModelEx.access$14700(GalleryViewModelEx.this).nodeBundle == null) {
                    } else {
                        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Page_Detail_Button-SKUItemDetail4");
                        uTCustomHitBuilder.setEventPage("Page_Detail");
                        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2101");
                        String str = eqb.c(GalleryViewModelEx.access$14800(GalleryViewModelEx.this).nodeBundle).itemId;
                        if (StringUtils.isEmpty(str)) {
                            str = "";
                        }
                        uTCustomHitBuilder.setProperty("item_id", str);
                        String str2 = eqb.d(GalleryViewModelEx.access$14900(GalleryViewModelEx.this).nodeBundle).userId;
                        if (StringUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        uTCustomHitBuilder.setProperty("seller_id", str2);
                        uTCustomHitBuilder.setProperty("args", "a2141.7631564.SKUItemDetail4");
                        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
                        f.a(GalleryViewModelEx.access$15000(GalleryViewModelEx.this), new edp());
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.b
    public void onVideoProgressChanged(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mIndicatorBar == null) {
        } else {
            int currrentPosition = this.mIndicatorBar.getCurrrentPosition();
            List<ItemNode.VideoItem.AnchorInfo> anchors = this.mIndicatorBar.getAnchors();
            int size = anchors != null ? anchors.size() : 0;
            if (anchors == null || size == 0 || currrentPosition >= size) {
                return;
            }
            while (true) {
                if (i5 >= size) {
                    i4 = currrentPosition;
                    break;
                }
                int i6 = anchors.get(i5).endTime;
                if (i < i6) {
                    if (i > i6 - 2000) {
                        i5++;
                    }
                    i4 = size - 1;
                    if (i5 <= i4) {
                        i4 = i5;
                    }
                } else {
                    i5++;
                }
            }
            if (i4 < currrentPosition) {
                this.shakeCount++;
                if (this.shakeCount < 5) {
                    return;
                }
            }
            this.shakeCount = 0L;
            if (this.mIndicatorBar.getTag() != null) {
                if (((Integer) this.mIndicatorBar.getTag()).intValue() != i4) {
                    dzh.c(this.mContext, i4, this.mTBMultiMediaModel);
                    this.mIndicatorBar.setTag(Integer.valueOf(i4));
                }
            } else {
                this.mIndicatorBar.setTag(-1);
            }
            if (i4 == currrentPosition) {
                return;
            }
            this.mIndicatorBar.setCurrentPosition(i4);
            this.mBlackLightIndicatorBar.setCurrentPosition(i4);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.b
    public void onVerticalScroll(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db988f49", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Math.abs(this.historyY - i2) < 5 || this.mContainerHeight == 0) {
            this.historyY = i2;
        } else {
            this.historyY = i2;
            if (i == 0) {
                this.transparency = 1.0f - ((Math.abs(i2) * 1.0f) / (this.mContainerHeight / 5));
                if (Math.abs(i2) < this.mContainerHeight / 5) {
                    this.layoutManager.a(false);
                } else {
                    this.layoutManager.a(true);
                }
            } else {
                this.transparency = 0.0f;
                this.layoutManager.a(true);
            }
            float f = this.transparency;
            if (f < 0.0f) {
                this.transparency = 0.0f;
            } else if (f > 1.0f) {
                this.transparency = 1.0f;
            }
            this.mBlackLightIndicatorBar.setIndicatorAlpha(this.transparency);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.b
    public void enterBlacklightEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1b6572", new Object[]{this});
            return;
        }
        this.mTBMultiMediaModel.popGallerySource = GallerySourceType.UNKNOWN;
        popMultiMedia(false);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.b
    public boolean onClicked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a4c31d3", new Object[]{this})).booleanValue() : TStudioHelper.a().a(null, this.mContentView, this.mTBMultiMediaModel, false);
    }

    private void setVideoFlowState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8b32d2", new Object[]{this, new Integer(i)});
        } else if (!this.mTBMultiMediaModel.needVideoFlow) {
        } else {
            if (i == 0) {
                dzh.i(this.mContext, this.mTBMultiMediaModel);
                this.start = new Date(System.currentTimeMillis());
                this.mBlacklightDuration = 0L;
            } else if (i != 1 || this.start == null) {
            } else {
                this.end = new Date(System.currentTimeMillis());
                this.mBlacklightDuration = this.end.getTime() - this.start.getTime();
                dzh.a(this.mContext, String.valueOf(this.mBlacklightDuration / 1000.0d), this.mTBMultiMediaModel);
                this.start = null;
                this.end = null;
            }
        }
    }

    private boolean needShowTimeTunnel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83942733", new Object[]{this})).booleanValue() : this.mTBMultiMediaModel.currentIndex == 0 && this.mTBMultiMediaModel.timeTunnel != null && !StringUtils.isEmpty(this.mTBMultiMediaModel.timeTunnel.f10001a) && !StringUtils.isEmpty(this.mTBMultiMediaModel.timeTunnel.c);
    }

    private void setEventListenerToVideoViewModle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9541c149", new Object[]{this});
        } else if (this.mSubItemViewModels != null) {
            for (int i = 0; i < this.mSubItemViewModels.size(); i++) {
                com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b bVar = this.mSubItemViewModels.get(i);
                if (bVar != null && (bVar instanceof d)) {
                    ((d) bVar).a(this);
                }
            }
        }
    }

    public void trackShowTimeTunnel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da25aca4", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("trackPage", "Page_Detail_Show_Detail");
        hashMap.put("spm", this.mTBMultiMediaModel.timeTunnel.e != null ? this.mTBMultiMediaModel.timeTunnel.e : "a2141.7631564.1999020712");
        if (!StringUtils.isEmpty(this.mTBMultiMediaModel.timeTunnel.f)) {
            hashMap.put("scm", this.mTBMultiMediaModel.timeTunnel.f);
        }
        hashMap.put("trackId", "2201");
        enp enpVar = new enp(null);
        enpVar.f27473a = hashMap;
        f.a(this.mContext, enpVar);
    }

    public void setAivTimeTunnel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fefec48", new Object[]{this});
        } else if (!this.mTBMultiMediaModel.isPopupMode && needShowTimeTunnel()) {
            trackShowTimeTunnel();
            if (this.mAivTimeTunnel == null) {
                this.mAivTimeTunnel = new DetailImageView(this.mContext);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, epo.b(57));
                layoutParams.addRule(13, -1);
                epj.b().a(this.mTBMultiMediaModel.timeTunnel.f10001a, this.mAivTimeTunnel);
                this.mAivTimeTunnel.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        dzh.h(GalleryViewModelEx.access$15100(GalleryViewModelEx.this), GalleryViewModelEx.access$15200(GalleryViewModelEx.this).timeTunnel.e != null ? GalleryViewModelEx.access$15300(GalleryViewModelEx.this).timeTunnel.e : "a2141.7631564.1999020712", GalleryViewModelEx.access$15400(GalleryViewModelEx.this).timeTunnel.f);
                        Bundle bundle = new Bundle();
                        bundle.putString("itemId", GalleryViewModelEx.access$15500(GalleryViewModelEx.this).itemId);
                        bundle.putString("origin", "Origin_Detail");
                        epq.a(GalleryViewModelEx.access$15600(GalleryViewModelEx.this), GalleryViewModelEx.access$15700(GalleryViewModelEx.this).timeTunnel.c, bundle);
                    }
                });
                this.mContentView.addView(this.mAivTimeTunnel, layoutParams);
            }
            this.mAivTimeTunnel.setVisibility(0);
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    GalleryViewModelEx.access$15800(GalleryViewModelEx.this).bringToFront();
                    GalleryViewModelEx.access$15900(GalleryViewModelEx.this).requestLayout();
                    GalleryViewModelEx.access$16000(GalleryViewModelEx.this).invalidate();
                }
            }, 500L);
        } else {
            DetailImageView detailImageView = this.mAivTimeTunnel;
            if (detailImageView == null) {
                return;
            }
            detailImageView.setVisibility(4);
        }
    }

    private d getVideoViewModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("93d846ee", new Object[]{this});
        }
        if (this.mSubItemViewModels == null) {
            return null;
        }
        Iterator<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b next = it.next();
            if (next != null && (next instanceof d)) {
                return (d) next;
            }
        }
        return null;
    }

    private void autoFitIndicatorBarBottomMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9e8466", new Object[]{this});
        } else if (this.mTBMultiMediaModel != null && this.mTBMultiMediaModel.currentIndex == 0) {
            d videoViewModel = getVideoViewModel();
            if (videoViewModel == null || videoViewModel.b() == null || this.mIndicatorBar == null) {
                return;
            }
            if (videoViewModel.b().getVideoState() == 2 || videoViewModel.b().getVideoState() == 1) {
                videoViewModel.b().showController();
                this.mIndicatorBar.setBottomMarginByPixel(videoViewModel.e());
                return;
            }
            this.mIndicatorBar.setBottomMarginByPixel(epo.k);
        } else {
            this.mIndicatorBar.setBottomMarginByPixel(epo.k);
        }
    }

    /* loaded from: classes5.dex */
    public class b extends MultiMediaViewModel.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-182446877);
        }

        public b() {
            super();
        }

        @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel.a
        public View.OnClickListener a(final int i, final GalleryViewModel.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View.OnClickListener) ipChange.ipc$dispatch("7b01892e", new Object[]{this, new Integer(i), bVar});
            }
            i.d("MyLog", "getClickPopMultiMediaListener in GalleryViewModelEx ");
            return new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (GalleryViewModelEx.this.onClicked()) {
                    } else {
                        dzh.a(GalleryViewModelEx.access$16100(GalleryViewModelEx.this), i, GalleryViewModelEx.access$16200(GalleryViewModelEx.this));
                        GalleryViewModelEx.access$16300(GalleryViewModelEx.this, false);
                    }
                }
            };
        }

        @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel.a
        public void a(TBMultiMediaModel tBMultiMediaModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("715d4c84", new Object[]{this, tBMultiMediaModel});
                return;
            }
            DetailEvent detailEvent = new DetailEvent(1);
            detailEvent.params = tBMultiMediaModel;
            f.a(GalleryViewModelEx.access$16400(GalleryViewModelEx.this), detailEvent);
        }

        @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel.a
        public int e(SubItemModel subItemModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("182da177", new Object[]{this, subItemModel})).intValue();
            }
            if (subItemModel instanceof VideoModel) {
                if (VideoModel.isVideoSize_3_4(((VideoModel) subItemModel).spatialVideoDimension)) {
                    return (int) ((epo.b / 3.0d) * 4.0d);
                }
            } else if ((subItemModel instanceof GalleryVideoModel) && GalleryVideoModel.isVideoSize_3_4(((GalleryVideoModel) subItemModel).getVideoRatio())) {
                return (int) ((epo.b / 3.0d) * 4.0d);
            }
            return b();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel
    /* renamed from: getUtils  reason: collision with other method in class */
    public b mo897getUtils() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("299a5865", new Object[]{this}) : new b();
    }
}
