package com.taobao.tao.favorite.jsbridge;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.odw;
import tb.riy;

/* loaded from: classes8.dex */
public class FavoriteJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    public static /* synthetic */ Object ipc$super(FavoriteJsBridge favoriteJsBridge, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1272103224);
        TAG = FavoriteJsBridge.class.getSimpleName();
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContext = null;
        super.onDestroy();
    }

    public FavoriteJsBridge(Activity activity) {
        this.mContext = activity;
    }

    public FavoriteJsBridge() {
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("addFavoriteCollection".equals(str)) {
            addFavoriteCollection(wVCallBackContext, str2);
        } else if ("deleteFavoriteCollection".equals(str)) {
            deleteFavoriteCollection(wVCallBackContext, str2);
        } else if (!"isFavoriteCollection".equals(str)) {
            return false;
        } else {
            isFavoriteCollection(wVCallBackContext, str2);
        }
        return true;
    }

    @WindVaneInterface
    public final void addFavoriteCollection(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a345a929", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map map = (Map) JSON.parseObject(str, Map.class);
        if (this.mContext == null || !(this.mContext instanceof Activity)) {
            return;
        }
        Bundle bundle = new Bundle();
        String str2 = null;
        bundle.putString("com.taobao.tao.mytaobao.favContent.appName", map.get("appName") == null ? null : map.get("appName").toString());
        bundle.putInt("com.taobao.tao.mytaobao.favContent.itemType", (map.get("itemType") == null ? null : Integer.valueOf(map.get("itemType").toString())).intValue());
        bundle.putInt("com.taobao.tao.mytaobao.favContent.bizId", (map.get("bizId") == null ? null : Integer.valueOf(map.get("bizId").toString())).intValue());
        bundle.putString("com.taobao.tao.mytaobao.favContent.bizoutitemid", map.get("bizOutItemId") == null ? null : map.get("bizOutItemId").toString());
        bundle.putString("com.taobao.tao.mytaobao.favContent.title", map.get("title") == null ? null : map.get("title").toString());
        bundle.putString("com.taobao.tao.mytaobao.favContent.picUrl", map.get("picture") == null ? null : map.get("picture").toString());
        bundle.putString("com.taobao.tao.mytaobao.favContent.note", map.get("note") == null ? null : map.get("note").toString());
        if (map.get("contentUrl") != null) {
            str2 = map.get("contentUrl").toString();
        }
        bundle.putString("com.taobao.tao.mytaobao.favContent.contentUrl", str2);
        odw.a((Activity) this.mContext, bundle, new IFavContentCallBack.Stub() { // from class: com.taobao.tao.favorite.jsbridge.FavoriteJsBridge.1
            @Override // com.taobao.tao.favorite.aidl.IFavContentCallBack
            public void onResult(Map map2) throws RemoteException {
                HashMap hashMap = (HashMap) map2;
                if ("success".equals((String) hashMap.get("com.taobao.tao.mytaobao.favContent.result"))) {
                    wVCallBackContext.success("{result:success}");
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                wVCallBackContext2.error("{result:fail,message:" + ((String) hashMap.get("com.taobao.tao.mytaobao.favContent.data")) + riy.BLOCK_END_STR);
            }
        });
    }

    @WindVaneInterface
    public final void deleteFavoriteCollection(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8ed333", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map map = (Map) JSON.parseObject(str, Map.class);
        if (this.mContext == null || !(this.mContext instanceof Activity)) {
            return;
        }
        Bundle bundle = new Bundle();
        String str2 = null;
        bundle.putString("com.taobao.tao.mytaobao.favContent.appName", map.get("appName") == null ? null : map.get("appName").toString());
        bundle.putInt("com.taobao.tao.mytaobao.favContent.itemType", (map.get("itemType") == null ? null : Integer.valueOf(map.get("itemType").toString())).intValue());
        bundle.putInt("com.taobao.tao.mytaobao.favContent.bizId", (map.get("bizId") == null ? null : Integer.valueOf(map.get("bizId").toString())).intValue());
        if (map.get("bizOutItemId") != null) {
            str2 = map.get("bizOutItemId").toString();
        }
        bundle.putString("com.taobao.tao.mytaobao.favContent.bizoutitemid", str2);
        odw.b((Activity) this.mContext, bundle, new IFavContentCallBack.Stub() { // from class: com.taobao.tao.favorite.jsbridge.FavoriteJsBridge.2
            @Override // com.taobao.tao.favorite.aidl.IFavContentCallBack
            public void onResult(Map map2) throws RemoteException {
                HashMap hashMap = (HashMap) map2;
                if ("success".equals((String) hashMap.get("com.taobao.tao.mytaobao.favContent.result"))) {
                    wVCallBackContext.success("{result:success}");
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                wVCallBackContext2.error("{result:fail,message:" + ((String) hashMap.get("com.taobao.tao.mytaobao.favContent.data")) + riy.BLOCK_END_STR);
            }
        });
    }

    @WindVaneInterface
    public final void isFavoriteCollection(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e472be32", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map map = (Map) JSON.parseObject(str, Map.class);
        if (this.mContext == null || !(this.mContext instanceof Activity)) {
            return;
        }
        Bundle bundle = new Bundle();
        String str2 = null;
        bundle.putString("com.taobao.tao.mytaobao.favContent.appName", map.get("appName") == null ? null : map.get("appName").toString());
        bundle.putInt("com.taobao.tao.mytaobao.favContent.itemType", (map.get("itemType") == null ? null : Integer.valueOf(map.get("itemType").toString())).intValue());
        bundle.putInt("com.taobao.tao.mytaobao.favContent.bizId", (map.get("bizId") == null ? null : Integer.valueOf(map.get("bizId").toString())).intValue());
        if (map.get("bizOutItemId") != null) {
            str2 = map.get("bizOutItemId").toString();
        }
        bundle.putString("com.taobao.tao.mytaobao.favContent.bizoutitemid", str2);
        odw.c((Activity) this.mContext, bundle, new IFavContentCallBack.Stub() { // from class: com.taobao.tao.favorite.jsbridge.FavoriteJsBridge.3
            @Override // com.taobao.tao.favorite.aidl.IFavContentCallBack
            public void onResult(Map map2) throws RemoteException {
                HashMap hashMap = (HashMap) map2;
                if ("success".equals((String) hashMap.get("com.taobao.tao.mytaobao.favContent.result"))) {
                    if ("true".equals(hashMap.get("com.taobao.tao.mytaobao.favContent.data"))) {
                        wVCallBackContext.success("{result:success,isFavorite:true}");
                        return;
                    } else {
                        wVCallBackContext.success("{result:success,isFavorite:false}");
                        return;
                    }
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                wVCallBackContext2.error("{result:fail,message:" + ((String) hashMap.get("com.taobao.tao.mytaobao.favContent.data")) + riy.BLOCK_END_STR);
            }
        });
    }
}
