package com.taobao.taopai.material.request.musiclist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.MusicListBean;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicSearchBusiness extends MusicListBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1167666655);
    }

    public static /* synthetic */ Object ipc$super(MusicSearchBusiness musicSearchBusiness, String str, Object... objArr) {
        if (str.hashCode() == -1674528713) {
            return super.getRequest();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.taopai.material.request.musiclist.MusicListBusiness, com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this}) : "";
    }

    @Override // com.taobao.taopai.material.request.musiclist.MusicListBusiness, com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getUtRequestKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a583454", new Object[]{this}) : "music_search";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.musiclist.MusicListBusiness, com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void handleCacheLoaded(MusicListBean musicListBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1507baa5", new Object[]{this, musicListBean});
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.musiclist.MusicListBusiness, com.taobao.taopai.material.request.base.BaseMaterialBusiness
    /* renamed from: parseCacheData */
    public MusicListBean mo1426parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicListBean) ipChange.ipc$dispatch("3ad840a5", new Object[]{this, str});
        }
        return null;
    }

    public MusicSearchBusiness(b bVar, a aVar) {
        super(bVar, aVar);
    }

    @Override // com.taobao.taopai.material.request.musiclist.MusicListBusiness
    public MusicListRequest getRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicListRequest) ipChange.ipc$dispatch("9c30b837", new Object[]{this});
        }
        MusicListRequest request = super.getRequest();
        request.setSearchTerms(this.mParams.j());
        return request;
    }
}
