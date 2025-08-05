package com.taobao.tao.detail.biz.api5;

import android.support.v4.util.LruCache;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.clientDomain.TBDetailResultVO;
import com.taobao.tao.detail.biz.adapter.DetailSwitcherAdapter;
import com.taobao.tao.detail.biz.api5.common.ApiRequest;
import com.taobao.tao.detail.biz.api5.common.ApiRequestListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.rjr;
import tb.tpc;

/* loaded from: classes8.dex */
public class DetailApiEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ApiRequest EMPTY_API_REQ;
    private static Map<Integer, DetailApiEngine> b;
    private static LruCache<String, TBDetailResultVO> c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19909a;
    private View d;

    public static /* synthetic */ LruCache a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("9326d4ce", new Object[0]) : c;
    }

    public static /* synthetic */ View a(DetailApiEngine detailApiEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d407f568", new Object[]{detailApiEngine}) : detailApiEngine.d;
    }

    static {
        kge.a(1796104401);
        EMPTY_API_REQ = new ApiRequest();
        b = new HashMap();
        c = new LruCache<>(rjr.a(DetailSwitcherAdapter.a("detailVOCache_size", "2"), 2));
        tpc.a("com.taobao.tao.detail.biz.api5.DetailApiEngine");
    }

    /* loaded from: classes8.dex */
    public class CommonApiListener<T> implements ApiRequestListener<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ApiRequestListener<T> apiRequestListenerRef;

        static {
            kge.a(1491325136);
            kge.a(-1314069645);
        }

        public CommonApiListener(ApiRequestListener<T> apiRequestListener) {
            this.apiRequestListenerRef = apiRequestListener;
        }

        @Override // com.taobao.tao.detail.biz.api5.common.ApiRequestListener
        public void onError(MtopResponse mtopResponse) {
            ApiRequestListener<T> apiRequestListener;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            if (this.apiRequestListenerRef != null && DetailApiEngine.this.f19909a && (apiRequestListener = this.apiRequestListenerRef) != null) {
                apiRequestListener.onError(mtopResponse);
            }
            hideMask();
        }

        @Override // com.taobao.tao.detail.biz.api5.common.ApiRequestListener
        public void onSuccess(T t) {
            ApiRequestListener<T> apiRequestListener;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, t});
                return;
            }
            if (this.apiRequestListenerRef != null && DetailApiEngine.this.f19909a && (apiRequestListener = this.apiRequestListenerRef) != null) {
                apiRequestListener.onSuccess(t);
            }
            hideMask();
        }

        public void hideMask() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31d614d5", new Object[]{this});
            } else if (DetailApiEngine.a(DetailApiEngine.this) == null) {
            } else {
                DetailApiEngine.a(DetailApiEngine.this).setVisibility(8);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class DetailApiListener extends CommonApiListener<TBDetailResultVO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(301991594);
        }

        public static /* synthetic */ Object ipc$super(DetailApiListener detailApiListener, String str, Object... objArr) {
            if (str.hashCode() == -363327801) {
                super.onSuccess((DetailApiListener) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public DetailApiListener(ApiRequestListener<TBDetailResultVO> apiRequestListener) {
            super(apiRequestListener);
        }

        @Override // com.taobao.tao.detail.biz.api5.DetailApiEngine.CommonApiListener, com.taobao.tao.detail.biz.api5.common.ApiRequestListener
        public void onSuccess(TBDetailResultVO tBDetailResultVO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d599f0c", new Object[]{this, tBDetailResultVO});
                return;
            }
            super.onSuccess((DetailApiListener) tBDetailResultVO);
            if (tBDetailResultVO == null || tBDetailResultVO.itemInfoModel == null || tBDetailResultVO.itemInfoModel.itemId == null) {
                return;
            }
            DetailApiEngine.a().put(tBDetailResultVO.itemInfoModel.itemId, tBDetailResultVO);
        }
    }
}
