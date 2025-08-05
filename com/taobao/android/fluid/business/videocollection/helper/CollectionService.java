package com.taobao.android.fluid.business.videocollection.helper;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.render.a;
import com.taobao.android.fluid.business.videocollection.poplayer.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.obp;
import tb.obq;
import tb.obr;
import tb.obs;
import tb.slk;
import tb.sps;

/* loaded from: classes5.dex */
public class CollectionService implements ICollectionService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mCollectionPagingEnable;
    private obr mCollectionPagingManager;
    private boolean mCollectionRecommendEnable;
    private final b mCollectionServiceConfig = new b();
    private obs mCollectionVideoPlayManager;
    private final FluidContext mFluidContext;
    private boolean mNewPageRecommend;

    static {
        kge.a(-1230241245);
        kge.a(1872445026);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public CollectionService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public boolean isCollectionPagingEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("719044c2", new Object[]{this})).booleanValue() : this.mCollectionPagingEnable;
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public void setCollectionPagingEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599b939e", new Object[]{this, new Boolean(z)});
        } else {
            this.mCollectionPagingEnable = z;
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public b getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("62aaa706", new Object[]{this}) : this.mCollectionServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public boolean isNewPageRecommend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9869782", new Object[]{this})).booleanValue() : this.mNewPageRecommend;
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public void setNewPageRecommend(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bf8ede", new Object[]{this, new Boolean(z)});
        } else {
            this.mNewPageRecommend = z;
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public boolean isCollectionPage(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d29c1154", new Object[]{this, fluidContext})).booleanValue();
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null) {
            return false;
        }
        return TextUtils.equals(sessionParams.b, a.GUANGGUANG_COLLECTION);
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public boolean isCollectionRecommendEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb31b5e2", new Object[]{this})).booleanValue() : this.mCollectionRecommendEnable;
    }

    @Override // com.taobao.android.fluid.business.videocollection.helper.ICollectionService
    public void setCollectionRecommendEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1716f5ee", new Object[]{this, new Boolean(z)});
        } else {
            this.mCollectionRecommendEnable = z;
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mCollectionPagingManager = new obp(this.mFluidContext);
        this.mCollectionVideoPlayManager = new obq(this.mFluidContext);
    }

    @Override // tb.obs
    public void requestCollectionNextVideo(String str, obq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ad66e1", new Object[]{this, str, aVar});
        } else {
            this.mCollectionVideoPlayManager.requestCollectionNextVideo(str, aVar);
        }
    }

    @Override // tb.obs
    public void playCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24bdfd", new Object[]{this});
        } else {
            this.mCollectionVideoPlayManager.playCollectionNextVideo();
        }
    }

    @Override // tb.obs
    public slk.a getCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (slk.a) ipChange.ipc$dispatch("8bd50afc", new Object[]{this}) : this.mCollectionVideoPlayManager.getCollectionNextVideo();
    }

    @Override // tb.obs
    public void cancelPlayCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a393b23", new Object[]{this});
        } else {
            this.mCollectionVideoPlayManager.cancelPlayCollectionNextVideo();
        }
    }

    @Override // tb.obs
    public void clearCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ba26c4", new Object[]{this});
        } else {
            this.mCollectionVideoPlayManager.clearCollectionNextVideo();
        }
    }

    @Override // tb.obr
    public void requestCollectionList(boolean z, Map map, int i, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90930d98", new Object[]{this, new Boolean(z), map, new Integer(i), aVar});
        } else {
            this.mCollectionPagingManager.requestCollectionList(z, map, i, aVar);
        }
    }

    @Override // tb.obr
    public void collectionPagingInsertData(int i, slk.a aVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af97113", new Object[]{this, new Integer(i), aVar, new Integer(i2)});
        } else {
            this.mCollectionPagingManager.collectionPagingInsertData(i, aVar, i2);
        }
    }

    @Override // tb.obr
    public boolean LoadFromCollectionPagingCache(int i, com.taobao.android.fluid.core.a<slk.a> aVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ae79c54", new Object[]{this, new Integer(i), aVar, new Boolean(z)})).booleanValue() : this.mCollectionPagingManager.LoadFromCollectionPagingCache(i, aVar, z);
    }

    @Override // tb.obr
    public ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> syncloadFromCollectionPagingCache(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("53d31489", new Object[]{this, new Integer(i)}) : this.mCollectionPagingManager.syncloadFromCollectionPagingCache(i);
    }

    @Override // tb.obr
    public void checkToInsertDetailList(int i, int i2, int i3, slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768685d2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), aVar});
        } else {
            this.mCollectionPagingManager.checkToInsertDetailList(i, i2, i3, aVar);
        }
    }

    @Override // tb.obr
    public void scrollToIndexForPaging(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3814e7", new Object[]{this, str, new Integer(i)});
        } else {
            this.mCollectionPagingManager.scrollToIndexForPaging(str, i);
        }
    }

    @Override // tb.obr
    public HashMap<Integer, com.taobao.android.fluid.framework.data.datamodel.a> getCollectionMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("898f0652", new Object[]{this}) : this.mCollectionPagingManager.getCollectionMap();
    }

    @Override // tb.obr
    public HashMap<String, Integer> getContentIdMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("786f5b68", new Object[]{this}) : this.mCollectionPagingManager.getContentIdMap();
    }
}
