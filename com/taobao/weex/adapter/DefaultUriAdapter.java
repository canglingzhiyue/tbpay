package com.taobao.weex.adapter;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultUriAdapter implements URIAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1700047639);
        kge.a(-763230114);
    }

    @Override // com.taobao.weex.adapter.URIAdapter
    public Uri rewrite(WXSDKInstance wXSDKInstance, String str, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("43293c99", new Object[]{this, wXSDKInstance, str, uri}) : rewrite(wXSDKInstance.ak(), str, uri);
    }

    @Override // com.taobao.weex.adapter.URIAdapter
    public Uri rewrite(String str, String str2, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("edd1c9b7", new Object[]{this, str, str2, uri});
        }
        if (TextUtils.isEmpty(str)) {
            return uri;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = uri.buildUpon();
        if (!uri.isRelative()) {
            return uri;
        }
        if (uri.getEncodedPath().length() != 0) {
            return buildRelativeURI(buildUpon, parse, uri).build();
        }
        return (!"image".equals(str2) || !TextUtils.isEmpty(uri.toString())) ? parse : uri;
    }

    private Uri.Builder buildRelativeURI(Uri.Builder builder, Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri.Builder) ipChange.ipc$dispatch("fe35ac57", new Object[]{this, builder, uri, uri2});
        }
        if (uri2.getAuthority() != null) {
            return builder.scheme(uri.getScheme());
        }
        builder.encodedAuthority(uri.getEncodedAuthority()).scheme(uri.getScheme()).path(null);
        if (uri2.getPath().startsWith("/")) {
            builder.appendEncodedPath(uri2.getEncodedPath().substring(1));
        } else {
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size() - (!uri.getPath().endsWith("/"));
            for (int i = 0; i < size; i++) {
                builder.appendEncodedPath(pathSegments.get(i));
            }
            builder.appendEncodedPath(uri2.getEncodedPath());
        }
        return builder;
    }
}
