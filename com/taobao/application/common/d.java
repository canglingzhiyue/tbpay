package com.taobao.application.common;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public interface d {
    public static final d DEFAULT = new d() { // from class: com.taobao.application.common.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.application.common.d
        public float a(String str, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue() : f;
        }

        @Override // com.taobao.application.common.d
        public int a(String str, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : i;
        }

        @Override // com.taobao.application.common.d
        public long a(String str, long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue() : j;
        }

        @Override // com.taobao.application.common.d
        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : str2;
        }

        @Override // com.taobao.application.common.d
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : z;
        }

        @Override // com.taobao.application.common.d
        public boolean c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
            }
            return false;
        }
    };

    float a(String str, float f);

    int a(String str, int i);

    long a(String str, long j);

    String a(String str, String str2);

    boolean a(String str, boolean z);

    boolean c(String str);
}
