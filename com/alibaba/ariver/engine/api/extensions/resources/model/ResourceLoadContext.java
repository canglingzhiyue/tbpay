package com.alibaba.ariver.engine.api.extensions.resources.model;

import android.net.Uri;
import com.alibaba.ariver.kernel.api.node.Node;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ResourceLoadContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int WEBTYPE_IS_NOT_WEBVIEW;
    public static int WEBTYPE_RN_VIEW;
    public static int WEBTYPE_SYSTEM_BUILD_IN;
    public static int WEBTYPE_THIRD_PARTY;
    public boolean canAsyncFallback;
    public boolean canDegradeGlobalPackage;
    public boolean canUseFallback;
    public boolean isMainDoc;
    public String originUrl;
    public Node sourceNode;
    public Uri uri;
    @Deprecated
    public int webType;

    static {
        kge.a(1173546223);
        WEBTYPE_SYSTEM_BUILD_IN = 1;
        WEBTYPE_THIRD_PARTY = 2;
        WEBTYPE_RN_VIEW = 3;
        WEBTYPE_IS_NOT_WEBVIEW = 4;
    }

    public ResourceLoadContext() {
        this.canDegradeGlobalPackage = true;
    }

    public ResourceLoadContext(Builder builder) {
        this.originUrl = builder.originUrl;
        if (builder.uri == null) {
            this.uri = Uri.parse(this.originUrl);
        } else {
            this.uri = builder.uri;
        }
        this.canUseFallback = builder.canUseFallback;
        this.canAsyncFallback = builder.canAsyncFallback;
        this.isMainDoc = builder.isMainDoc;
        this.webType = builder.webType;
        this.canDegradeGlobalPackage = builder.canDegradeGlobalPackage;
    }

    public static Builder newBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("7958a5d", new Object[0]) : new Builder();
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean canUseFallback;
        public String originUrl;
        public Node sourceNode;
        public Uri uri;
        public boolean canAsyncFallback = false;
        public boolean canDegradeGlobalPackage = true;
        public boolean isMainDoc = false;
        public int webType = ResourceLoadContext.WEBTYPE_IS_NOT_WEBVIEW;

        static {
            kge.a(-1621533498);
        }

        public Builder uri(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c664b4cb", new Object[]{this, uri});
            }
            this.uri = uri;
            return this;
        }

        public Builder originUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ec0c6005", new Object[]{this, str});
            }
            this.originUrl = str;
            return this;
        }

        public Builder canUseFallback(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3f81734b", new Object[]{this, new Boolean(z)});
            }
            this.canUseFallback = z;
            return this;
        }

        public Builder canAsyncFallback(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d8d0c700", new Object[]{this, new Boolean(z)});
            }
            this.canAsyncFallback = z;
            return this;
        }

        public Builder isMainDoc(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("44d590e7", new Object[]{this, new Boolean(z)});
            }
            this.isMainDoc = z;
            return this;
        }

        public Builder webType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e2c36b51", new Object[]{this, new Integer(i)});
            }
            this.webType = i;
            return this;
        }

        public Builder sourceNode(Node node) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9e607e2d", new Object[]{this, node});
            }
            this.sourceNode = node;
            return this;
        }

        public Builder canDegradeGlobalPackage(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c117896f", new Object[]{this, new Boolean(z)});
            }
            this.canDegradeGlobalPackage = z;
            return this;
        }

        public ResourceLoadContext build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ResourceLoadContext) ipChange.ipc$dispatch("32442321", new Object[]{this}) : new ResourceLoadContext(this);
        }
    }
}
