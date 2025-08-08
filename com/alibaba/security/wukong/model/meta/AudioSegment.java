package com.alibaba.security.wukong.model.meta;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AudioSegment extends BaseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] data;
    public int length;

    /* loaded from: classes3.dex */
    public enum AudioEncodingConfig {
        ENCODING_PCM_16BIT(16, "16bit"),
        ENCODING_PCM_8BIT(8, "8bit");
        
        public String name;
        public int value;

        AudioEncodingConfig(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static AudioEncodingConfig getByName(String str) {
            AudioEncodingConfig[] values;
            if (StringUtils.isEmpty(str)) {
                return ENCODING_PCM_16BIT;
            }
            for (AudioEncodingConfig audioEncodingConfig : values()) {
                if (str.equals(audioEncodingConfig.name)) {
                    return audioEncodingConfig;
                }
            }
            return ENCODING_PCM_16BIT;
        }

        public static AudioEncodingConfig getByValue(int i) {
            AudioEncodingConfig[] values;
            for (AudioEncodingConfig audioEncodingConfig : values()) {
                if (i == audioEncodingConfig.value) {
                    return audioEncodingConfig;
                }
            }
            return ENCODING_PCM_16BIT;
        }
    }

    /* loaded from: classes3.dex */
    public enum AudioFormat {
        mp3(1, "mp3"),
        pcm(2, "pcm"),
        wav(3, "wav"),
        aac(4, "aac");
        
        public String name;
        public int value;

        AudioFormat(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static AudioFormat getByName(String str) {
            AudioFormat[] values;
            if (StringUtils.isEmpty(str)) {
                return pcm;
            }
            for (AudioFormat audioFormat : values()) {
                if (str.equals(audioFormat.name)) {
                    return audioFormat;
                }
            }
            return pcm;
        }
    }

    public AudioSegment(byte[] bArr, int i) {
        super(System.currentTimeMillis());
        this.data = bArr;
        this.length = i;
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this}) : this.data;
    }

    public int getLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33609456", new Object[]{this})).intValue() : this.length;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public Map<String, Object> getRawMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49177706", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public int length() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue() : this.length;
    }

    public void setData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252501ba", new Object[]{this, bArr});
        } else {
            this.data = bArr;
        }
    }

    public void setLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf17de74", new Object[]{this, new Integer(i)});
        } else {
            this.length = i;
        }
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : "audio";
    }

    public AudioSegment(byte[] bArr, int i, long j) {
        super(j);
        this.data = bArr;
        this.length = i;
    }
}
