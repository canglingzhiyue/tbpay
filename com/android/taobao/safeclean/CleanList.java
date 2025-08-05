package com.android.taobao.safeclean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class CleanList implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appVersion = "";
    public List<CleanModel> cleanDataList = new ArrayList();

    static {
        kge.a(-1213531263);
        kge.a(1028243835);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CleanList)) {
            return false;
        }
        CleanList cleanList = (CleanList) obj;
        return this.appVersion.equals(cleanList.appVersion) && collectionsEqual(this.cleanDataList, cleanList.cleanDataList);
    }

    private boolean collectionsEqual(List<CleanModel> list, List<CleanModel> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8fca38c", new Object[]{this, list, list2})).booleanValue();
        }
        if (list.size() == list2.size()) {
            return list.containsAll(list2);
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CleanList{appVersion='" + this.appVersion + "', cleanDataList=" + this.cleanDataList + '}';
    }

    /* loaded from: classes3.dex */
    public static class CleanModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int dataId = 0;
        public String type = "internal";
        public int strategy = 0;
        public String fileRoot = "";
        public String fileLocation = "";
        public String extension = "";
        public String exclude = "";

        static {
            kge.a(-80194685);
            kge.a(1028243835);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CleanModel)) {
                return false;
            }
            CleanModel cleanModel = (CleanModel) obj;
            return this.dataId == cleanModel.dataId && this.type.equals(cleanModel.type) && this.strategy == cleanModel.strategy && this.fileRoot.equals(cleanModel.fileRoot) && this.fileLocation.equals(cleanModel.fileLocation) && this.extension.equals(cleanModel.extension) && this.exclude.equals(cleanModel.exclude);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            Iterator it = Arrays.asList(Integer.valueOf(this.dataId), this.type, Integer.valueOf(this.strategy), this.fileRoot, this.fileLocation, this.extension, this.exclude).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next == null ? 0 : next.hashCode());
            }
            return i;
        }
    }
}
