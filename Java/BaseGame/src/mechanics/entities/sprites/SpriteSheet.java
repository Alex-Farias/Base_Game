package mechanics.entities.sprites;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteSheet {
    private int frames;
    private BufferedImage spritesheet;

    public SpriteSheet(String path) {
        try {
            spritesheet = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getSprite(int x, int y, int width, int height) {
        return spritesheet.getSubimage(x, y, width, height);
    }

    public int getFrames() {
        return frames;
    }

    public BufferedImage getSpritesheet() {
        return spritesheet;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }

    public void setSpritesheet(BufferedImage spritesheet) {
        this.spritesheet = spritesheet;
    }
}
