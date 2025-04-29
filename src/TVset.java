import javax.swing.*;

public class TVset {
    private int currentChannel, volume;

    TVset() {
        this.currentChannel = 1;
        this.volume = 50;
    }

    public void setChannel(int numOfChannel) {
        if (numOfChannel < 1 || numOfChannel > 50) {
            throw new IllegalArgumentException("Номер канала должен быть от 1 до 50");
        } else {
            this.currentChannel = numOfChannel;
        }
    }


    public void setVolume(int newVolume) {
        if (newVolume < 0 || newVolume > 100) {
            throw new IllegalArgumentException("Громкость должна быть от 0 до 100");
        } else {
            this.volume = newVolume;
        }
    }

    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public int getVolume() {
        return this.volume;
        }

    private void Channel() {
        if (this.currentChannel == 50) {
            this.currentChannel = 1;
        } else {
            this.currentChannel += 1;
        }

    }
}
