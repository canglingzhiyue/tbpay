package com.taobao.android.a11y.ability.ocr;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class OCRResponseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String code;
    public Map<String, OCRResponseItemData> data;
    public GrayInfo grayInfo;
    public String successful;

    static {
        kge.a(-2004491281);
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this}) : this.code;
    }

    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.code = str;
        }
    }

    public String getSuccessful() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c12f0669", new Object[]{this}) : this.successful;
    }

    public void setSuccessful(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9b4e2d", new Object[]{this, str});
        } else {
            this.successful = str;
        }
    }

    public Map<String, OCRResponseItemData> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }

    public void setData(Map<String, OCRResponseItemData> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.data = map;
        }
    }

    public GrayInfo getGrayInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GrayInfo) ipChange.ipc$dispatch("4e832c71", new Object[]{this}) : this.grayInfo;
    }

    public void setGrayInfo(GrayInfo grayInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22eb983", new Object[]{this, grayInfo});
        } else {
            this.grayInfo = grayInfo;
        }
    }

    /* loaded from: classes4.dex */
    public static class OCRResponseItemData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String content;
        public String tableReco;

        static {
            kge.a(637221287);
        }

        public String getContent() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : this.content;
        }

        public void setContent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
            } else {
                this.content = str;
            }
        }

        public String getTableReco() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4fbf8f42", new Object[]{this}) : this.tableReco;
        }

        public void setTableReco(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a7014dc", new Object[]{this, str});
            } else {
                this.tableReco = str;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class GrayInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String tableRecoGray;

        static {
            kge.a(1357222630);
        }

        public String getTableRecoGray() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6ab841f", new Object[]{this}) : this.tableRecoGray;
        }

        public void setTableRecoGray(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3364e19f", new Object[]{this, str});
            } else {
                this.tableRecoGray = str;
            }
        }
    }
}
