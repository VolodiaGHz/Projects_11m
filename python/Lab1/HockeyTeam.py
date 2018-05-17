class HockeyTeam:
    total_people = 0

    def __init__(self, name="", people=0, scored_goals=0, place_in_tournament=0, missed_goals=0):
        self.name = name
        self.people = people
        self.scored_goals = scored_goals
        self.place_in_tournament = place_in_tournament
        self.missed_goals = missed_goals
        HockeyTeam.total_people += self.people

    def to_string(self):
        print("Name: " + self.name + ", people: " + str(self.people) + ", scored goals: " + str(self.scored_goals)
              + ", place in tournament: " + str(self.place_in_tournament) + ", missed goals: " + str(
            self.missed_goals))

    def print_sum(self):
        print("Total people of the team " + self.name + "is " + str(self.people))

    @staticmethod
    def print_static_sum():
        print("The total people is " + str(HockeyTeam.total_people))


if __name__ == "__main__":
    sokil = HockeyTeam()
    pinguins = HockeyTeam("Pinguins", 6, 15, 5, 10)
    washington = HockeyTeam("Washington", 6, 22, 3, 8)

    sokil.to_string()
    pinguins.to_string()
    washington.to_string()

    HockeyTeam.print_static_sum()
    pinguins.print_sum()
    washington.print_sum()
