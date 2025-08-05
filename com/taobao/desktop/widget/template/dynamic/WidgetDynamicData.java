package com.taobao.desktop.widget.template.dynamic;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class WidgetDynamicData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deepLink;
    private ExtData ext;
    private String imageUrl;
    private long nextRefreshTime;

    static {
        kge.a(1024216069);
        kge.a(1028243835);
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this}) : this.imageUrl;
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.imageUrl = str;
        }
    }

    public String getDeepLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2eb98bfd", new Object[]{this}) : this.deepLink;
    }

    public void setDeepLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33554e19", new Object[]{this, str});
        } else {
            this.deepLink = str;
        }
    }

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue() : this.nextRefreshTime;
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }

    public ExtData getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExtData) ipChange.ipc$dispatch("389d0127", new Object[]{this}) : this.ext;
    }

    public void setExt(ExtData extData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2b2d29", new Object[]{this, extData});
        } else {
            this.ext = extData;
        }
    }

    /* loaded from: classes7.dex */
    public static class ExtData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String collect;
        private String title;

        static {
            kge.a(1482118060);
            kge.a(1028243835);
        }

        public String getTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
        }

        public void setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.title = str;
            }
        }

        public String getCollect() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c95f285", new Object[]{this}) : this.collect;
        }

        public void setCollect(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd2be6f9", new Object[]{this, str});
            } else {
                this.collect = str;
            }
        }
    }
}
