package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public class EncodedImage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    public final int rotation;

    /* loaded from: classes9.dex */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        private final int nativeIndex;

        FrameType(int i) {
            this.nativeIndex = i;
        }

        static FrameType fromNativeIndex(int i) {
            FrameType[] values;
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException("Unknown native frame type: " + i);
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    static {
        kge.a(-231935580);
    }

    private EncodedImage(ByteBuffer byteBuffer, int i, int i2, long j, FrameType frameType, int i3, boolean z, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j);
        this.captureTimeNs = j;
        this.frameType = frameType;
        this.rotation = i3;
        this.completeFrame = z;
        this.qp = num;
    }

    public static Builder builder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("42c479b8", new Object[0]) : new Builder();
    }

    /* loaded from: classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;
        private Integer qp;
        private int rotation;

        static {
            kge.a(2066343035);
        }

        private Builder() {
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5c3ce13e", new Object[]{this, byteBuffer});
            }
            this.buffer = byteBuffer;
            return this;
        }

        public Builder setEncodedWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("15c043d8", new Object[]{this, new Integer(i)});
            }
            this.encodedWidth = i;
            return this;
        }

        public Builder setEncodedHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ec74efbf", new Object[]{this, new Integer(i)});
            }
            this.encodedHeight = i;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6b2f599c", new Object[]{this, new Long(j)});
            }
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }

        public Builder setCaptureTimeNs(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("343050dd", new Object[]{this, new Long(j)});
            }
            this.captureTimeNs = j;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cf2a7284", new Object[]{this, frameType});
            }
            this.frameType = frameType;
            return this;
        }

        public Builder setRotation(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("97357472", new Object[]{this, new Integer(i)});
            }
            this.rotation = i;
            return this;
        }

        public Builder setCompleteFrame(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c23b1711", new Object[]{this, new Boolean(z)});
            }
            this.completeFrame = z;
            return this;
        }

        public Builder setQp(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f4b66e65", new Object[]{this, num});
            }
            this.qp = num;
            return this;
        }

        public EncodedImage createEncodedImage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EncodedImage) ipChange.ipc$dispatch("82d3f11d", new Object[]{this}) : new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.qp);
        }
    }
}
