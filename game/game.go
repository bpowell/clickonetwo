package game

type Hero struct {
	Damage int
	Level  int
}

func NewHero() *Hero {
	return &Hero{}
}

type Player struct {
	Hero1    *Hero
	Hero2    *Hero
	Hero3    *Hero
	Currency int
}

func NewPlayer() *Player {
	return &Player{}
}
