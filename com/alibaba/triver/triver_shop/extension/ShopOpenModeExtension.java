package com.alibaba.triver.triver_shop.extension;

import android.net.Uri;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.triver.extensions.DefOpenModeExtension;
import com.alibaba.triver.kit.api.utils.TRiverUrlUtils;
import com.alibaba.triver.point.TriverOpenModeProxy;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ccx;
import tb.kge;

/* loaded from: classes3.dex */
public class ShopOpenModeExtension extends DefOpenModeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-949169788);
    }

    public static /* synthetic */ Object ipc$super(ShopOpenModeExtension shopOpenModeExtension, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1991742357) {
            if (hashCode == -488249507) {
                return new Integer(super.getMaxInstanceCount((String) objArr[0], (Uri) objArr[1]));
            }
            if (hashCode != 263446360) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.getOpenMode((String) objArr[0], (Uri) objArr[1], (List) objArr[2]);
        }
        return super.getSingleMode((String) objArr[0], (Uri) objArr[1]);
    }

    public TriverOpenModeProxy.OpenMode getOpenMode(String str, Uri uri, List<RVAppRecord> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriverOpenModeProxy.OpenMode) ipChange.ipc$dispatch("fb3df58", new Object[]{this, str, uri, list});
        }
        if (TRiverUrlUtils.c(uri.toString())) {
            if (ccx.s()) {
                return TriverOpenModeProxy.OpenMode.SINGLE_INSTANCE;
            }
            return TriverOpenModeProxy.OpenMode.MULTI_INSTANCE;
        }
        return super.getOpenMode(str, uri, list);
    }

    public TriverOpenModeProxy.SingleMode getSingleMode(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriverOpenModeProxy.SingleMode) ipChange.ipc$dispatch("89486c6b", new Object[]{this, str, uri});
        }
        if (TRiverUrlUtils.c(uri.toString())) {
            return TriverOpenModeProxy.SingleMode.NEW_INSTANCE;
        }
        return super.getSingleMode(str, uri);
    }

    public int getMaxInstanceCount(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2e5e75d", new Object[]{this, str, uri})).intValue() : super.getMaxInstanceCount(str, uri);
    }
}
